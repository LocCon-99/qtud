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
 * The persistent class for the AUTO_SYN_PARAM database table.
 * 
 */
@Entity
@Table(name="AUTO_SYN_PARAM")
@NamedQuery(name="AutoSynParam.findAll", query="SELECT a FROM AutoSynParam a")
public class AutoSynParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

	@Column(name="FROM_COL")
	private Integer fromCol;

	@Column(name="PAR_NAME")
	private String parName;

	@Column(name="PAR_VALUE")
	private String parValue;

	@Column(name="TO_COL")
	private Integer toCol;

	public AutoSynParam() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getFromCol() {
		return this.fromCol;
	}

	public void setFromCol(Integer fromCol) {
		this.fromCol = fromCol;
	}

	public String getParName() {
		return this.parName;
	}

	public void setParName(String parName) {
		this.parName = parName;
	}

	public String getParValue() {
		return this.parValue;
	}

	public void setParValue(String parValue) {
		this.parValue = parValue;
	}

	public Integer getToCol() {
		return this.toCol;
	}

	public void setToCol(Integer toCol) {
		this.toCol = toCol;
	}

}