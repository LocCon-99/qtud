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

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the APPLICATIONS database table.
 * 
 */
@Entity
@Table(name="APPLICATIONS")
@NamedQuery(name="Application.findAll", query="SELECT a FROM Application a")
public class Application implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="APP_ID")
	private String appId;

	@Column(name="APP_CODE")
	private String appCode;

	@Column(name="APP_NAME")
	private String appName;

	private String description;

	@Column(name="SECURITY_OPTION")
	private Integer securityOption;

	private Integer status;

	//bi-directional many-to-one association to Object
	@JsonIgnore
	@OneToMany(mappedBy="application")
	private Set<Object> objects;

	//bi-directional many-to-one association to Role
	@JsonIgnore
	@OneToMany(mappedBy="application")
	private Set<Role> roles;

	public Application() {
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSecurityOption() {
		return this.securityOption;
	}

	public void setSecurityOption(Integer securityOption) {
		this.securityOption = securityOption;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set<Object> getObjects() {
		return this.objects;
	}

	public void setObjects(Set<Object> objects) {
		this.objects = objects;
	}

	public Object addObject(Object object) {
		getObjects().add(object);
		object.setApplication(this);

		return object;
	}

	public Object removeObject(Object object) {
		getObjects().remove(object);
		object.setApplication(null);

		return object;
	}

	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Role addRole(Role role) {
		getRoles().add(role);
		role.setApplication(this);

		return role;
	}

	public Role removeRole(Role role) {
		getRoles().remove(role);
		role.setApplication(null);

		return role;
	}

}