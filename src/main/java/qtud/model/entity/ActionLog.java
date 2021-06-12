package qtud.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;


/**
 * The persistent class for the ACTION_LOG database table.
 * 
 */
@Entity
@Table(name="ACTION_LOG")
@NamedQuery(name="ActionLog.findAll", query="SELECT a FROM ActionLog a")
public class ActionLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="LOG_ID")
	private String logId;

	@Column(name="ACTION")
	private String action;

	@Column(name="IP_ADDRESS")
	private String ipAddress;

	@Column(name="LOG_TIME")
	private Timestamp logTime;

	@Column(name="USER_ID")
	private String userId;

	public ActionLog() {
	}

	public String getLogId() {
		return this.logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Timestamp getLogTime() {
		if (logTime == null) {
		   return null;
		}
		return new Timestamp(logTime.getTime());
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = (logTime == null ? null : new Timestamp(logTime.getTime()));
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}