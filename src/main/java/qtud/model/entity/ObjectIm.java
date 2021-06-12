package qtud.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the OBJECT_IM database table.
 * 
 */
@Entity
@Table(name="OBJECT_IM")
@NamedQuery(name="ObjectIm.findAll", query="SELECT o FROM ObjectIm o")
public class ObjectIm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="APP_ID")
	private String appId;

	private String description;

	@Column(name="OBJECT_ID")
	private String objectId;

	@Column(name="OBJECT_NAME")
	private String objectName;

	@Column(name="OBJECT_TEMPLATE")
	private String objectTemplate;

	@Column(name="OBJECT_TYPE")
	private String objectType;

	@Column(name="OBJECT_URL")
	private String objectUrl;

	private Integer ord;

	@Column(name="PARENT_ID")
	private String parentId;

	private Integer status;

	public ObjectIm() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
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

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}