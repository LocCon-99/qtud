package qtud.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the ROLE_ROLE database table.
 * 
 */
@Entity
@Table(name="ROLE_ROLE")
@NamedQuery(name="RoleRole.findAll", query="SELECT r FROM RoleRole r")
public class RoleRole implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="ROLE_ID")
	private String roleId;

	@Column(name="APP_ID")
	private String appId;

	private String description;

	@Column(name="OBJ_TYPE")
	private String objType;

	@Column(name="ROLE_NAME")
	private String roleName;

	private Integer status;

	@Column(name="SUB_ROLE_ID")
	private String subRoleId;

	//bi-directional one-to-one association to Role
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="ROLE_ID", insertable=false, updatable=false)
	private Role role;

	public RoleRole() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleId() {
		return this.roleId;
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

	public String getSubRoleId() {
		return this.subRoleId;
	}

	public void setSubRoleId(String subRoleId) {
		this.subRoleId = subRoleId;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}