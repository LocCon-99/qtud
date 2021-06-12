package qtud.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the DEPT_USER_POS database table.
 * 
 */
@Entity
@Table(name="DEPT_USER_POS")
@NamedQuery(name="DeptUserPos.findAll", query="SELECT d FROM DeptUserPos d")
public class DeptUserPos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="DEPT_USR_POS_ID")
	private String deptUsrPosId;

	@Column(name="DEPT_ID")
	private String deptId;
	
	@Column(name="POS_ID")
	private String posId;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="STATUS")
	private Integer status;

	//bi-directional many-to-one association to Department
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="DEPT_ID", insertable=false, updatable=false)
	private Department department;

	//bi-directional many-to-one association to Position
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="POS_ID", insertable=false, updatable=false)
	private Position position;

	//bi-directional many-to-one association to User
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="USER_ID", insertable=false, updatable=false)
	private User user;

	//bi-directional many-to-one association to DeptUsrPosObjPriv
	@JsonIgnore
	@OneToMany(mappedBy="deptUserPos")
	private Set<DeptUsrPosObjPriv> deptUsrPosObjPrivs;

	//bi-directional one-to-one association to DeptUsrPosRole
	@JsonIgnore
	@OneToOne(mappedBy="deptUserPos")
	private DeptUsrPosRole deptUsrPosRole;

	public DeptUserPos() {
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getPosId() {
		return posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDeptUsrPosId() {
		return this.deptUsrPosId;
	}

	public void setDeptUsrPosId(String deptUsrPosId) {
		this.deptUsrPosId = deptUsrPosId;
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

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<DeptUsrPosObjPriv> getDeptUsrPosObjPrivs() {
		return this.deptUsrPosObjPrivs;
	}

	public void setDeptUsrPosObjPrivs(Set<DeptUsrPosObjPriv> deptUsrPosObjPrivs) {
		this.deptUsrPosObjPrivs = deptUsrPosObjPrivs;
	}

	public DeptUsrPosObjPriv addDeptUsrPosObjPriv(DeptUsrPosObjPriv deptUsrPosObjPriv) {
		getDeptUsrPosObjPrivs().add(deptUsrPosObjPriv);
		deptUsrPosObjPriv.setDeptUserPos(this);

		return deptUsrPosObjPriv;
	}

	public DeptUsrPosObjPriv removeDeptUsrPosObjPriv(DeptUsrPosObjPriv deptUsrPosObjPriv) {
		getDeptUsrPosObjPrivs().remove(deptUsrPosObjPriv);
		deptUsrPosObjPriv.setDeptUserPos(null);

		return deptUsrPosObjPriv;
	}

	public DeptUsrPosRole getDeptUsrPosRole() {
		return this.deptUsrPosRole;
	}

	public void setDeptUsrPosRole(DeptUsrPosRole deptUsrPosRole) {
		this.deptUsrPosRole = deptUsrPosRole;
	}

}