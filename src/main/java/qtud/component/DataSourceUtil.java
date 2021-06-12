package qtud.component;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.stereotype.Component;

@Component
public class DataSourceUtil {
	@Autowired
	private Environment env;
	private int DEFAULT_HK_POOL_SIZE = 10;
	private long DEFAULT_HK_CONN_TIMEOUT_MS = 60000L;

	public DataSource createDatasource(String prefix, String dataSourceName) {
		String propJndiName = prefix + ".jndi-name";
		String jndiDs = this.env.getProperty(propJndiName);
		if (jndiDs != null && !jndiDs.isEmpty()) {
			JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
			DataSource ds = dsLookup.getDataSource(jndiDs);
			return ds;
		} else {
			String propUrl = prefix + ".url";
			String propUserName = prefix + ".username";
			String propPassword = prefix + ".password";
			String propDriverClass = prefix + ".driver-class-name";
			String prophkPoolSize = prefix + ".hikari.maximum-pool-size";
			String prophkConnTimeout = prefix + ".hikari.connection-timeout";
			int hkPoolSize = this.DEFAULT_HK_POOL_SIZE;
			long hkConnectionTimeOut = this.DEFAULT_HK_CONN_TIMEOUT_MS;

			try {
				hkPoolSize = Integer.parseInt(this.env.getProperty(prophkPoolSize));
				hkConnectionTimeOut = Long.parseLong(this.env.getProperty(prophkConnTimeout));
			} catch (Exception var15) {
				;
			}

			HikariDataSource hkds = new HikariDataSource();
			hkds.setDriverClassName(this.env.getProperty(propDriverClass));
			hkds.setJdbcUrl(this.env.getProperty(propUrl));
			hkds.setUsername(this.env.getProperty(propUserName));
			hkds.setPassword(this.env.getProperty(propPassword));
			hkds.setMaximumPoolSize(hkPoolSize);
			hkds.setConnectionTimeout(hkConnectionTimeOut);
			hkds.setPoolName(dataSourceName);
			return hkds;
		}
	}
}