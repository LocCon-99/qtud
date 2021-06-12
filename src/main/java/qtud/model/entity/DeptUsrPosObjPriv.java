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
 * The persistent class for the DEPT_USR_POS_OBJ_PRIV database table.
 * 
 */
@Entity
@Table(name="DEPT_USR_POS_OBJ_PRIV")
@NamedQuery(name="DeptUsrPosObjPriv.findAll", query="SELECT d FROM DeptUsrPosObjPriv d")
public class DeptUsrPosObjPriv implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="DEPT_USR_POS_ID")
	private String deptUsrPosId;

	@Column(name="OBJECT_ID")
	private String objectId;

	@Column(name="PRIV_ID")
	private String privId;

	@Column(name="PARENT_OBJ_ID")
	private String parentObjId;

	private Integer status;

	//bi-directional many-to-one association to DeptUserPo
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="DEPT_USR_POS_ID", insertable=false, updatable=false)
	private DeptUserPos deptUserPos;

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

	public DeptUsrPosObjPriv() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeptUsrPosId() {
		return deptUsrPosId;
	}

	public void setDeptUsrPosId(String deptUsrPosId) {
		this.deptUsrPosId = deptUsrPosId;
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

	public DeptUserPos getDeptUserPos() {
		return this.deptUserPos;
	}

	public void setDeptUserPos(DeptUserPos deptUserPos) {
		this.deptUserPos = deptUserPos;
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