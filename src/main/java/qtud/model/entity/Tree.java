package qtud.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the TREES database table.
 * 
 */
@Entity
@Table(name="TREES")
@NamedQuery(name="Tree.findAll", query="SELECT t FROM Tree t")
public class Tree implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="DEPT_ID")
	private String deptId;

	@Column(name="PARENT_GROUP_ID")
	private String parentGroupId;

	@Column(name="TREE_ID")
	private String treeId;

	public Tree() {
	}

	public String getDeptId() {
		return this.deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentGroupId() {
		return this.parentGroupId;
	}

	public void setParentGroupId(String parentGroupId) {
		this.parentGroupId = parentGroupId;
	}

	public String getTreeId() {
		return this.treeId;
	}

	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}

}