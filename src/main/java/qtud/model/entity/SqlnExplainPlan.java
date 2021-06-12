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
 * The persistent class for the SQLN_EXPLAIN_PLAN database table.
 * 
 */
@Entity
@Table(name="SQLN_EXPLAIN_PLAN")
@NamedQuery(name="SqlnExplainPlan.findAll", query="SELECT s FROM SqlnExplainPlan s")
public class SqlnExplainPlan implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	private Long bytes;

	private Long cardinality;

	private Long cost;

	private String distribution;

	@Column(name="OBJECT_INSTANCE")
	private Long objectInstance;

	@Column(name="OBJECT_NAME")
	private String objectName;

	@Column(name="OBJECT_NODE")
	private String objectNode;

	@Column(name="OBJECT_OWNER")
	private String objectOwner;

	@Column(name="OBJECT_TYPE")
	private String objectType;

	@Column(name="OPERATION")
	private String operation;

	private String optimizer;

	private String options;

	private Object other;

	@Column(name="OTHER_TAG")
	private String otherTag;

	@Column(name="PARENT_ID")
	private String parentId;

	@Column(name="PARTITION_ID")
	private String partitionId;

	@Column(name="PARTITION_START")
	private String partitionStart;

	@Column(name="PARTITION_STOP")
	private String partitionStop;

	@Column(name="POSITION")
	private Long position;

	private String remarks;

	@Column(name="SEARCH_COLUMNS")
	private Long searchColumns;

	@Column(name="STATEMENT_ID")
	private String statementId;

	@Column(name="TIMESTAMP")
	private Timestamp timestamp;

	public SqlnExplainPlan() {
	}

	public Long getBytes() {
		return this.bytes;
	}

	public void setBytes(Long bytes) {
		this.bytes = bytes;
	}

	public Long getCardinality() {
		return this.cardinality;
	}

	public void setCardinality(Long cardinality) {
		this.cardinality = cardinality;
	}

	public Long getCost() {
		return this.cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public String getDistribution() {
		return this.distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getObjectInstance() {
		return this.objectInstance;
	}

	public void setObjectInstance(Long objectInstance) {
		this.objectInstance = objectInstance;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectNode() {
		return this.objectNode;
	}

	public void setObjectNode(String objectNode) {
		this.objectNode = objectNode;
	}

	public String getObjectOwner() {
		return this.objectOwner;
	}

	public void setObjectOwner(String objectOwner) {
		this.objectOwner = objectOwner;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOptimizer() {
		return this.optimizer;
	}

	public void setOptimizer(String optimizer) {
		this.optimizer = optimizer;
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public Object getOther() {
		return this.other;
	}

	public void setOther(Object other) {
		this.other = other;
	}

	public String getOtherTag() {
		return this.otherTag;
	}

	public void setOtherTag(String otherTag) {
		this.otherTag = otherTag;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getPartitionId() {
		return this.partitionId;
	}

	public void setPartitionId(String partitionId) {
		this.partitionId = partitionId;
	}

	public String getPartitionStart() {
		return this.partitionStart;
	}

	public void setPartitionStart(String partitionStart) {
		this.partitionStart = partitionStart;
	}

	public String getPartitionStop() {
		return this.partitionStop;
	}

	public void setPartitionStop(String partitionStop) {
		this.partitionStop = partitionStop;
	}

	public Long getPosition() {
		return this.position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getSearchColumns() {
		return this.searchColumns;
	}

	public void setSearchColumns(Long searchColumns) {
		this.searchColumns = searchColumns;
	}

	public String getStatementId() {
		return this.statementId;
	}

	public void setStatementId(String statementId) {
		this.statementId = statementId;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}