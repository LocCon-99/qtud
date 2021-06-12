package qtud.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the DEPARTMENT database table.
 * 
 */
@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="DEPT_ID")
	private String deptId;

	private String address;

	private String code;

	@Column(name="DEPT_NAME")
	private String deptName;

	private String description;

	@Column(name="PROVINCE_CODE")
	private String provinceCode;

	private Integer status;

	private String telephone;

	@Column(name="TYPE")
	private Integer type;

	//bi-directional many-to-one association to DeptObjectPriv
	@JsonIgnore
	@OneToMany(mappedBy="department")
	private Set<DeptObjectPriv> deptObjectPrivs;

	//bi-directional many-to-one association to DeptRole
	@JsonIgnore
	@OneToMany(mappedBy="department")
	private Set<DeptRole> deptRoles;

	//bi-directional many-to-one association to DeptUserPo
	@JsonIgnore
	@OneToMany(mappedBy="department")
	private Set<DeptUserPos> deptUserPos;

	public Department() {
	}

	public String getDeptId() {
		return this.deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Set<DeptObjectPriv> getDeptObjectPrivs() {
		return this.deptObjectPrivs;
	}

	public void setDeptObjectPrivs(Set<DeptObjectPriv> deptObjectPrivs) {
		this.deptObjectPrivs = deptObjectPrivs;
	}

	public DeptObjectPriv addDeptObjectPriv(DeptObjectPriv deptObjectPriv) {
		getDeptObjectPrivs().add(deptObjectPriv);
		deptObjectPriv.setDepartment(this);

		return deptObjectPriv;
	}

	public DeptObjectPriv removeDeptObjectPriv(DeptObjectPriv deptObjectPriv) {
		getDeptObjectPrivs().remove(deptObjectPriv);
		deptObjectPriv.setDepartment(null);

		return deptObjectPriv;
	}

	public Set<DeptRole> getDeptRoles() {
		return this.deptRoles;
	}

	public void setDeptRoles(Set<DeptRole> deptRoles) {
		this.deptRoles = deptRoles;
	}

	public DeptRole addDeptRole(DeptRole deptRole) {
		getDeptRoles().add(deptRole);
		deptRole.setDepartment(this);

		return deptRole;
	}

	public DeptRole removeDeptRole(DeptRole deptRole) {
		getDeptRoles().remove(deptRole);
		deptRole.setDepartment(null);

		return deptRole;
	}

	public Set<DeptUserPos> getDeptUserPos() {
		return this.deptUserPos;
	}

	public void setDeptUserPos(Set<DeptUserPos> deptUserPos) {
		this.deptUserPos = deptUserPos;
	}

	public DeptUserPos addDeptUserPo(DeptUserPos deptUserPos) {
		getDeptUserPos().add(deptUserPos);
		deptUserPos.setDepartment(this);

		return deptUserPos;
	}

	public DeptUserPos removeDeptUserPo(DeptUserPos deptUserPos) {
		getDeptUserPos().remove(deptUserPos);
		deptUserPos.setDepartment(null);

		return deptUserPos;
	}

}