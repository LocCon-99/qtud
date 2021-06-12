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
 * The persistent class for the PLSQL_PROFILER_DATA database table.
 * 
 */
@Entity
@Table(name="PLSQL_PROFILER_DATA")
@NamedQuery(name="PlsqlProfilerData.findAll", query="SELECT p FROM PlsqlProfilerData p")
public class PlsqlProfilerData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	private Long line;

	@Column(name="MAX_TIME")
	private Long maxTime;

	@Column(name="MIN_TIME")
	private Long minTime;

	private Long runid;

	private Long spare1;

	private Long spare2;

	private Long spare3;

	private Long spare4;

	@Column(name="TOTAL_OCCUR")
	private Long totalOccur;

	@Column(name="TOTAL_TIME")
	private Long totalTime;

	@Column(name="UNIT_NUMBER")
	private Long unitNumber;

	public PlsqlProfilerData() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getLine() {
		return this.line;
	}

	public void setLine(Long line) {
		this.line = line;
	}

	public Long getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(Long maxTime) {
		this.maxTime = maxTime;
	}

	public Long getMinTime() {
		return this.minTime;
	}

	public void setMinTime(Long minTime) {
		this.minTime = minTime;
	}

	public Long getRunid() {
		return this.runid;
	}

	public void setRunid(Long runid) {
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

	public Long getSpare3() {
		return this.spare3;
	}

	public void setSpare3(Long spare3) {
		this.spare3 = spare3;
	}

	public Long getSpare4() {
		return this.spare4;
	}

	public void setSpare4(Long spare4) {
		this.spare4 = spare4;
	}

	public Long getTotalOccur() {
		return this.totalOccur;
	}

	public void setTotalOccur(Long totalOccur) {
		this.totalOccur = totalOccur;
	}

	public Long getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(Long totalTime) {
		this.totalTime = totalTime;
	}

	public Long getUnitNumber() {
		return this.unitNumber;
	}

	public void setUnitNumber(Long unitNumber) {
		this.unitNumber = unitNumber;
	}

}