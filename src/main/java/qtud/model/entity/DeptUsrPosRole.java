package qtud.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the DEPT_USR_POS_ROLE database table.
 * 
 */
@Entity
@Table(name="DEPT_USR_POS_ROLE")
@NamedQuery(name="DeptUsrPosRole.findAll", query="SELECT d FROM DeptUsrPosRole d")
public class DeptUsrPosRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;
	
	@Column(name="DEPT_USR_POS_ID")
	private String deptUsrPosId;

	@Column(name="APP_ID")
	private String appId;
	
	@Column(name="ROLE_ID")
	private String roleId;

	private Integer status;

	//bi-directional one-to-one association to DeptUserPo
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="DEPT_USR_POS_ID", insertable=false, updatable=false)
	private DeptUserPos deptUserPos;

	//bi-directional many-to-one association to Role
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ROLE_ID", insertable=false, updatable=false)
	private Role role;

	public DeptUsrPosRole() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public void setDeptUserPos(DeptUserPos deptUserPos) {
		this.deptUserPos = deptUserPos;
	}

	public String getDeptUsrPosId() {
		return this.deptUsrPosId;
	}

	public void setDeptUsrPosId(String deptUsrPosId) {
		this.deptUsrPosId = deptUsrPosId;
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

	public DeptUserPos getDeptUserPos() {
		return this.deptUserPos;
	}

	public void setDeptUserPo(DeptUserPos deptUserPos) {
		this.deptUserPos = deptUserPos;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}