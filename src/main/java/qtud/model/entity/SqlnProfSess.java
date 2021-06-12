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
 * The persistent class for the SQLN_PROF_SESS database table.
 * 
 */
@Entity
@Table(name="SQLN_PROF_SESS")
@NamedQuery(name="SqlnProfSess.findAll", query="SELECT s FROM SqlnProfSess s")
public class SqlnProfSess implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	private String runid;

	@Column(name="STAT_ID")
	private String statId;

	@Column(name="VALUE")
	private Long value;

	public SqlnProfSess() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRunid() {
		return this.runid;
	}

	public void setRunid(String runid) {
		this.runid = runid;
	}

	public String getStatId() {
		return this.statId;
	}

	public void setStatId(String statId) {
		this.statId = statId;
	}

	public Long getValue() {
		return this.value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

}