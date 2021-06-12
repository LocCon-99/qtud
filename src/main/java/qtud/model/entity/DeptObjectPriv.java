package qtud.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the DEPT_OBJECT_PRIV database table.
 * 
 */
@Entity
@Table(name="DEPT_OBJECT_PRIV")
@NamedQuery(name="DeptObjectPriv.findAll", query="SELECT d FROM DeptObjectPriv d")
public class DeptObjectPriv implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;
	
	@Column(name="DEPT_ID")
	private String deptId;

	@Column(name="OBJECT_ID")
	private String objectId;

	@Column(name="PRIV_ID")
	private String privId;

	@Column(name="APP_ID")
	private String appId;

	@Column(name="PARENT_OBJ_ID")
	private String parentObjId;

	private Integer status;

	//bi-directional many-to-one association to Department
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="DEPT_ID", insertable=false, updatable=false)
	private Department department;

	//bi-directional many-to-one association to Object
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="OBJECT_ID", insertable=false, updatable=false)
	private Object object;

	//bi-directional many-to-one association to PriviType
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="PRIV_ID", insertable=false, updatable=false)
	private PriviType priviType;

	public DeptObjectPriv() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getPrivId() {
		return privId;
	}

	public void setPrivId(String privId) {
		this.privId = privId;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getParentObjId() {
		return this.parentObjId;
	}

	public void setParentObjId(String parentObjId) {
		this.parentObjId = parentObjId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public PriviType getPriviType() {
		return this.priviType;
	}

	public void setPriviType(PriviType priviType) {
		this.priviType = priviType;
	}

}