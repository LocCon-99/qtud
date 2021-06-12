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
 * The persistent class for the ROLE_OBJECT_PRIV database table.
 * 
 */
@Entity
@Table(name="ROLE_OBJECT_PRIV")
@NamedQuery(name="RoleObjectPriv.findAll", query="SELECT r FROM RoleObjectPriv r")
public class RoleObjectPriv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

	@Column(name="PARENT_OBJ_ID")
	private String parentObjId;

	@Column(name="PRIV_ID")
	private String privId;

	@Column(name="ROLE_ID")
	private String roleId;
	
	@Column(name="OBJECT_ID")
	private String objectId;

	private Integer status;

	//bi-directional many-to-one association to Object
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="OBJECT_ID", insertable=false, updatable=false)
	private Object object;

	public RoleObjectPriv() {
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentObjId() {
		return this.parentObjId;
	}

	public void setParentObjId(String parentObjId) {
		this.parentObjId = parentObjId;
	}

	public String getPrivId() {
		return this.privId;
	}

	public void setPrivId(String privId) {
		this.privId = privId;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}