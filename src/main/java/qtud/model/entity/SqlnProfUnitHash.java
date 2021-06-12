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
 * The persistent class for the SQLN_PROF_UNIT_HASH database table.
 * 
 */
@Entity
@Table(name="SQLN_PROF_UNIT_HASH")
@NamedQuery(name="SqlnProfUnitHash.findAll", query="SELECT s FROM SqlnProfUnitHash s")
public class SqlnProfUnitHash implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="HASH")
	private String hash;

	private String runid;

	@Column(name="UNIT_NUMBER")
	private Long unitNumber;

	public SqlnProfUnitHash() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getRunid() {
		return this.runid;
	}

	public void setRunid(String runid) {
		this.runid = runid;
	}

	public Long getUnitNumber() {
		return this.unitNumber;
	}

	public void setUnitNumber(Long unitNumber) {
		this.unitNumber = unitNumber;
	}

}