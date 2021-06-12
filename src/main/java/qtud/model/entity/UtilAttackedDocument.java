package qtud.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the UTIL_ATTACKED_DOCUMENTS database table.
 * 
 */
@Entity
@Table(name="UTIL_ATTACKED_DOCUMENTS")
@NamedQuery(name="UtilAttackedDocument.findAll", query="SELECT u FROM UtilAttackedDocument u")
public class UtilAttackedDocument implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="ATTACH_ID")
	private String attachId;

	private String code;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	private String description;

	@Column(name="DOC_SOURCE_TYPE")
	private Integer docSourceType;

	@Column(name="DOCUMENT_NAME")
	private String documentName;

	@Column(name="DOCUMENT_PATH")
	private String documentPath;

	@Column(name="LEVEL_ID")
	private Integer levelId;

	@Column(name="PARENT_ID")
	private String parentId;

	@Column(name="SIGNED_DATE")
	private Timestamp signedDate;

	private String signer;

	@Column(name="UPLOADER_ID")
	private Integer uploaderId;

	public UtilAttackedDocument() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttachId() {
		return this.attachId;
	}

	public void setAttachId(String attachId) {
		this.attachId = attachId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDocSourceType() {
		return this.docSourceType;
	}

	public void setDocSourceType(Integer docSourceType) {
		this.docSourceType = docSourceType;
	}

	public String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentPath() {
		return this.documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	public Integer getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Timestamp getSignedDate() {
		return this.signedDate;
	}

	public void setSignedDate(Timestamp signedDate) {
		this.signedDate = signedDate;
	}

	public String getSigner() {
		return this.signer;
	}

	public void setSigner(String signer) {
		this.signer = signer;
	}

	public Integer getUploaderId() {
		return this.uploaderId;
	}

	public void setUploaderId(Integer uploaderId) {
		this.uploaderId = uploaderId;
	}

}