package qtud.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the PRIVI_TYPE database table.
 * 
 */
@Entity
@Table(name="PRIVI_TYPE")
@NamedQuery(name="PriviType.findAll", query="SELECT p FROM PriviType p")
public class PriviType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="PRIV_ID")
	private String privId;

	private String description;

	@Column(name="OBJ_TYPE")
	private String objType;

	private Long priority;

	@Column(name="PRIV_NAME")
	private String privName;

	private Long status;

	//bi-directional many-to-one association to DeptObjectPriv
	@OneToMany(mappedBy="priviType")
	private Set<DeptObjectPriv> deptObjectPrivs;

	//bi-directional many-to-one association to DeptUsrPosObjPriv
	@OneToMany(mappedBy="priviType")
	private Set<DeptUsrPosObjPriv> deptUsrPosObjPrivs;

	public PriviType() {
	}

	public String getPrivId() {
		return this.privId;
	}

	public void setPrivId(String privId) {
		this.privId = privId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObjType() {
		return this.objType;
	}

	public void setObjType(String objType) {
		this.objType = objType;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getPrivName() {
		return this.privName;
	}

	public void setPrivName(String privName) {
		this.privName = privName;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Set<DeptObjectPriv> getDeptObjectPrivs() {
		return this.deptObjectPrivs;
	}

	public void setDeptObjectPrivs(Set<DeptObjectPriv> deptObjectPrivs) {
		this.deptObjectPrivs = deptObjectPrivs;
	}

	public DeptObjectPriv addDeptObjectPriv(DeptObjectPriv deptObjectPriv) {
		getDeptObjectPrivs().add(deptObjectPriv);
		deptObjectPriv.setPriviType(this);

		return deptObjectPriv;
	}

	public DeptObjectPriv removeDeptObjectPriv(DeptObjectPriv deptObjectPriv) {
		getDeptObjectPrivs().remove(deptObjectPriv);
		deptObjectPriv.setPriviType(null);

		return deptObjectPriv;
	}

	public Set<DeptUsrPosObjPriv> getDeptUsrPosObjPrivs() {
		return this.deptUsrPosObjPrivs;
	}

	public void setDeptUsrPosObjPrivs(Set<DeptUsrPosObjPriv> deptUsrPosObjPrivs) {
		this.deptUsrPosObjPrivs = deptUsrPosObjPrivs;
	}

	public DeptUsrPosObjPriv addDeptUsrPosObjPriv(DeptUsrPosObjPriv deptUsrPosObjPriv) {
		getDeptUsrPosObjPrivs().add(deptUsrPosObjPriv);
		deptUsrPosObjPriv.setPriviType(this);

		return deptUsrPosObjPriv;
	}

	public DeptUsrPosObjPriv removeDeptUsrPosObjPriv(DeptUsrPosObjPriv deptUsrPosObjPriv) {
		getDeptUsrPosObjPrivs().remove(deptUsrPosObjPriv);
		deptUsrPosObjPriv.setPriviType(null);

		return deptUsrPosObjPriv;
	}

}