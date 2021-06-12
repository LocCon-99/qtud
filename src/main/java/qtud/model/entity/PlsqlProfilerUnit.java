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
 * The persistent class for the PLSQL_PROFILER_UNITS database table.
 * 
 */
@Entity
@Table(name="PLSQL_PROFILER_UNITS")
@NamedQuery(name="PlsqlProfilerUnit.findAll", query="SELECT p FROM PlsqlProfilerUnit p")
public class PlsqlProfilerUnit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String runid;

	private Long spare1;

	private Long spare2;

	@Column(name="TOTAL_TIME")
	private Long totalTime;

	@Column(name="UNIT_NAME")
	private String unitName;

	@Column(name="UNIT_NUMBER")
	private Long unitNumber;

	@Column(name="UNIT_OWNER")
	private String unitOwner;

	@Column(name="UNIT_TIMESTAMP")
	private Timestamp unitTimestamp;

	@Column(name="UNIT_TYPE")
	private String unitType;

	public PlsqlProfilerUnit() {
	}

	public String getRunid() {
		return this.runid;
	}

	public void setRunid(String runid) {
		this.runid = runid;
	}

	public Long getSpare1() {
		return this.spare1;
	}

	public void setSpare1(Long spare1) {
		this.spare1 = spare1;
	}

	public Long getSpare2() {
		return this.spare2;
	}

	public void setSpare2(Long spare2) {
		this.spare2 = spare2;
	}

	public Long getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(Long totalTime) {
		this.totalTime = totalTime;
	}

	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Long getUnitNumber() {
		return this.unitNumber;
	}

	public void setUnitNumber(Long unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getUnitOwner() {
		return this.unitOwner;
	}

	public void setUnitOwner(String unitOwner) {
		this.unitOwner = unitOwner;
	}

	public Timestamp getUnitTimestamp() {
		return this.unitTimestamp;
	}

	public void setUnitTimestamp(Timestamp unitTimestamp) {
		this.unitTimestamp = unitTimestamp;
	}

	public String getUnitType() {
		return this.unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

}