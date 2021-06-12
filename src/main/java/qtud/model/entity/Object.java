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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the OBJECTS database table.
 * 
 */
@Entity
@Table(name="OBJECTS")
@NamedQuery(name="Object.findAll", query="SELECT o FROM Object o")
public class Object implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="OBJECT_ID")
	private String objectId;

	private String description;

	@Column(name="OBJECT_CODE")
	private String objectCode;

	@Column(name="OBJECT_LEVEL")
	private Integer objectLevel;

	@Column(name="OBJECT_NAME")
	private String objectName;

	@Column(name="OBJECT_TEMPLATE")
	private String objectTemplate;

	@Column(name="OBJECT_TYPE")
	private String objectType;

	@Column(name="OBJECT_TYPE_ID")
	private Integer objectTypeId;

	@Column(name="OBJECT_URL")
	private String objectUrl;

	private Integer ord;

	private Integer status;
	
	@Column(name="APP_ID")
	private String appId;
	
	@Column(name="PARENT_ID")
	private String parentId;

	//bi-directional many-to-one association to DeptObjectPriv
	@JsonIgnore
	@OneToMany(mappedBy="object")
	private Set<DeptObjectPriv> deptObjectPrivs;

	//bi-directional many-to-one association to DeptUsrPosObjPriv
	@JsonIgnore
	@OneToMany(mappedBy="object")
	private Set<DeptUsrPosObjPriv> deptUsrPosObjPrivs;

	//bi-directional many-to-one association to Application
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="APP_ID", insertable = false, updatable = false)
	private Application application;

	//bi-directional many-to-one association to Object
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="PARENT_ID", insertable = false, updatable = false)
	private Object object;

	//bi-directional many-to-one association to Object
	@JsonIgnore
	@OneToMany(mappedBy="object")
	private Set<Object> objects;

	//bi-directional many-to-one association to RoleObjectPriv
	@JsonIgnore
	@OneToMany(mappedBy="object")
	private Set<RoleObjectPriv> roleObjectPrivs;

	public Object() {
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObjectCode() {
		return this.objectCode;
	}

	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}

	public Integer getObjectLevel() {
		return this.objectLevel;
	}

	public void setObjectLevel(Integer objectLevel) {
		this.objectLevel = objectLevel;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectTemplate() {
		return this.objectTemplate;
	}

	public void setObjectTemplate(String objectTemplate) {
		this.objectTemplate = objectTemplate;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Integer getObjectTypeId() {
		return this.objectTypeId;
	}

	public void setObjectTypeId(Integer objectTypeId) {
		this.objectTypeId = objectTypeId;
	}

	public String getObjectUrl() {
		return this.objectUrl;
	}

	public void setObjectUrl(String objectUrl) {
		this.objectUrl = objectUrl;
	}

	public Integer getOrd() {
		return this.ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
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
		deptObjectPriv.setObject(this);

		return deptObjectPriv;
	}

	public DeptObjectPriv removeDeptObjectPriv(DeptObjectPriv deptObjectPriv) {
		getDeptObjectPrivs().remove(deptObjectPriv);
		deptObjectPriv.setObject(null);

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
		deptUsrPosObjPriv.setObject(this);

		return deptUsrPosObjPriv;
	}

	public DeptUsrPosObjPriv removeDeptUsrPosObjPriv(DeptUsrPosObjPriv deptUsrPosObjPriv) {
		getDeptUsrPosObjPrivs().remove(deptUsrPosObjPriv);
		deptUsrPosObjPriv.setObject(null);

		return deptUsrPosObjPriv;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Set<Object> getObjects() {
		return this.objects;
	}

	public void setObjects(Set<Object> objects) {
		this.objects = objects;
	}

	public Object addObject(Object object) {
		getObjects().add(object);
		object.setObject(this);

		return object;
	}

	public Object removeObject(Object object) {
		getObjects().remove(object);
		object.setObject(null);

		return object;
	}

	public Set<RoleObjectPriv> getRoleObjectPrivs() {
		return this.roleObjectPrivs;
	}

	public void setRoleObjectPrivs(Set<RoleObjectPriv> roleObjectPrivs) {
		this.roleObjectPrivs = roleObjectPrivs;
	}

	public RoleObjectPriv addRoleObjectPriv(RoleObjectPriv roleObjectPriv) {
		getRoleObjectPrivs().add(roleObjectPriv);
		roleObjectPriv.setObject(this);

		return roleObjectPriv;
	}

	public RoleObjectPriv removeRoleObjectPriv(RoleObjectPriv roleObjectPriv) {
		getRoleObjectPrivs().remove(roleObjectPriv);
		roleObjectPriv.setObject(null);

		return roleObjectPriv;
	}

}