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
 * The persistent class for the SQLN_PROF_ANB database table.
 * 
 */
@Entity
@Table(name="SQLN_PROF_ANB")
@NamedQuery(name="SqlnProfAnb.findAll", query="SELECT s FROM SqlnProfAnb s")
public class SqlnProfAnb implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	private Long line;

	private String runid;

	private String text;

	@Column(name="UNIT_NUMBER")
	private Long unitNumber;

	public SqlnProfAnb() {
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

	public String getRunid() {
		return this.runid;
	}

	public void setRunid(String runid) {
		this.runid = runid;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getUnitNumber() {
		return this.unitNumber;
	}

	public void setUnitNumber(Long unitNumber) {
		this.unitNumber = unitNumber;
	}

}