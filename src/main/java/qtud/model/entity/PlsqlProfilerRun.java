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
 * The persistent class for the PLSQL_PROFILER_RUNS database table.
 * 
 */
@Entity
@Table(name="PLSQL_PROFILER_RUNS")
@NamedQuery(name="PlsqlProfilerRun.findAll", query="SELECT p FROM PlsqlProfilerRun p")
public class PlsqlProfilerRun implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String runid;

	@Column(name="RELATED_RUN")
	private Long relatedRun;

	@Column(name="RUN_COMMENT")
	private String runComment;

	@Column(name="RUN_COMMENT1")
	private String runComment1;

	@Column(name="RUN_DATE")
	private Timestamp runDate;

	@Column(name="RUN_OWNER")
	private String runOwner;

	@Column(name="RUN_SYSTEM_INFO")
	private String runSystemInfo;

	@Column(name="RUN_TOTAL_TIME")
	private Long runTotalTime;

	private String spare1;

	public PlsqlProfilerRun() {
	}

	public String getRunid() {
		return this.runid;
	}

	public void setRunid(String runid) {
		this.runid = runid;
	}

	public Long getRelatedRun() {
		return this.relatedRun;
	}

	public void setRelatedRun(Long relatedRun) {
		this.relatedRun = relatedRun;
	}

	public String getRunComment() {
		return this.runComment;
	}

	public void setRunComment(String runComment) {
		this.runComment = runComment;
	}

	public String getRunComment1() {
		return this.runComment1;
	}

	public void setRunComment1(String runComment1) {
		this.runComment1 = runComment1;
	}

	public Timestamp getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Timestamp runDate) {
		this.runDate = runDate;
	}

	public String getRunOwner() {
		return this.runOwner;
	}

	public void setRunOwner(String runOwner) {
		this.runOwner = runOwner;
	}

	public String getRunSystemInfo() {
		return this.runSystemInfo;
	}

	public void setRunSystemInfo(String runSystemInfo) {
		this.runSystemInfo = runSystemInfo;
	}

	public Long getRunTotalTime() {
		return this.runTotalTime;
	}

	public void setRunTotalTime(Long runTotalTime) {
		this.runTotalTime = runTotalTime;
	}

	public String getSpare1() {
		return this.spare1;
	}

	public void setSpare1(String spare1) {
		this.spare1 = spare1;
	}

}