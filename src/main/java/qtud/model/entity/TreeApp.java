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
 * The persistent class for the TREE_APP database table.
 * 
 */
@Entity
@Table(name="TREE_APP")
@NamedQuery(name="TreeApp.findAll", query="SELECT t FROM TreeApp t")
public class TreeApp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="APP_ID")
	private String appId;

	@Column(name="TREE_ID")
	private String treeId;

	@Column(name="TYPE")
	private Integer type;

	public TreeApp() {
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

	public String getTreeId() {
		return this.treeId;
	}

	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}