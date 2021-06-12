package qtud.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the SQLN_PROF_UNITS database table.
 * 
 */
@Entity
@Table(name="SQLN_PROF_UNITS")
@NamedQuery(name="SqlnProfUnit.findAll", query="SELECT s FROM SqlnProfUnit s")
public class SqlnProfUnit implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="PROJ_ID")
	private String projId;

	@Column(name="UNIT_NAME")
	private String unitName;

	public SqlnProfUnit() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjId() {
		return this.projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

}