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
 * The persistent class for the AUTO_SYN_DATA database table.
 * 
 */
@Entity
@Table(name="AUTO_SYN_DATA")
@NamedQuery(name="AutoSynData.findAll", query="SELECT a FROM AutoSynData a")
public class AutoSynData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="DB_ID")
	private String dbId;

	@Column(name="SCN_LAST_SYN")
	private Integer scnLastSyn;

	@Column(name="TB_ID")
	private Integer tbId;

	public AutoSynData() {
	}

	public String getDbId() {
		return this.dbId;
	}

	public void setDbId(String dbId) {
		this.dbId = dbId;
	}

	public Integer getScnLastSyn() {
		return this.scnLastSyn;
	}

	public void setScnLastSyn(Integer scnLastSyn) {
		this.scnLastSyn = scnLastSyn;
	}

	public Integer getTbId() {
		return this.tbId;
	}

	public void setTbId(Integer tbId) {
		this.tbId = tbId;
	}

}