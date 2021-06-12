package qtud.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the AUTO_SYN_TB_PARAM database table.
 * 
 */
@Entity
@Table(name="AUTO_SYN_TB_PARAM")
@NamedQuery(name="AutoSynTbParam.findAll", query="SELECT a FROM AutoSynTbParam a")
public class AutoSynTbParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

	@Column(name="DB_ID")
	private String dbId;

	@Column(name="ORDER_ID")
	private String orderId;

	@Column(name="TABLE_NAME")
	private String tableName;

	public AutoSynTbParam() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDbId() {
		return this.dbId;
	}

	public void setDbId(String dbId) {
		this.dbId = dbId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}