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
 * The persistent class for the "ROLES" database table.
 * 
 */
@Entity
@Table(name="\"ROLES\"")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ROLE_ID")
	private String roleId;

	private String description;

	@Column(name="OBJ_TYPE")
	private String objType;

	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="APP_ID")
	private String appId;

	private Integer status;

	//bi-directional many-to-one association to DeptRole
	@JsonIgnore
	@OneToMany(mappedBy="role")
	private Set<DeptRole> deptRoles;

	//bi-directional many-to-one association to DeptUsrPosRole
	@JsonIgnore
	@OneToMany(mappedBy="role")
	private Set<DeptUsrPosRole> deptUsrPosRoles;

	//bi-directional many-to-one association to Application
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="APP_ID", insertable=false, updatable=false)
	private Application application;

	//bi-directional one-to-one association to RoleRole
	@JsonIgnore
	@OneToOne(mappedBy="role")
	private RoleRole roleRole;

	public Role() {
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set<DeptRole> getDeptRoles() {
		return this.deptRoles;
	}

	public void setDeptRoles(Set<DeptRole> deptRoles) {
		this.deptRoles = deptRoles;
	}

	public DeptRole addDeptRole(DeptRole deptRole) {
		getDeptRoles().add(deptRole);
		deptRole.setRole(this);

		return deptRole;
	}

	public DeptRole removeDeptRole(DeptRole deptRole) {
		getDeptRoles().remove(deptRole);
		deptRole.setRole(null);

		return deptRole;
	}

	public Set<DeptUsrPosRole> getDeptUsrPosRoles() {
		return this.deptUsrPosRoles;
	}

	public void setDeptUsrPosRoles(Set<DeptUsrPosRole> deptUsrPosRoles) {
		this.deptUsrPosRoles = deptUsrPosRoles;
	}

	public DeptUsrPosRole addDeptUsrPosRole(DeptUsrPosRole deptUsrPosRole) {
		getDeptUsrPosRoles().add(deptUsrPosRole);
		deptUsrPosRole.setRole(this);

		return deptUsrPosRole;
	}

	public DeptUsrPosRole removeDeptUsrPosRole(DeptUsrPosRole deptUsrPosRole) {
		getDeptUsrPosRoles().remove(deptUsrPosRole);
		deptUsrPosRole.setRole(null);

		return deptUsrPosRole;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public RoleRole getRoleRole() {
		return this.roleRole;
	}

	public void setRoleRole(RoleRole roleRole) {
		this.roleRole = roleRole;
	}

}