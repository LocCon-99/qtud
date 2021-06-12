package qtud.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the HILOSEQUENCES database table.
 * 
 */
@Entity
@Table(name="HILOSEQUENCES")
@NamedQuery(name="Hilosequence.findAll", query="SELECT h FROM Hilosequence h")
public class Hilosequence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String sequencename;

	private Long highvalues;

	public Hilosequence() {
	}

	public String getSequencename() {
		return this.sequencename;
	}

	public void setSequencename(String sequencename) {
		this.sequencename = sequencename;
	}

	public Long getHighvalues() {
		return this.highvalues;
	}

	public void setHighvalues(Long highvalues) {
		this.highvalues = highvalues;
	}

}