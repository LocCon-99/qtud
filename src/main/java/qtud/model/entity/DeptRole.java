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


/**
 * The persistent class for the DEPT_ROLE database table.
 * 
 */
@Entity
@Table(name="DEPT_ROLE")
@NamedQuery(name="DeptRole.findAll", query="SELECT d FROM DeptRole d")
public class DeptRole implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="DEPT_ID")
	private String deptId;

	@Column(name="ROLE_ID")
	private String roleId;

	@Column(name="APP_ID")
	private String appId;

	private Integer status;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="DEPT_ID", insertable=false, updatable=false)
	private Department department;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ROLE_ID", insertable=false, updatable=false)
	private Role role;

	public DeptRole() {
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

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
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

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}