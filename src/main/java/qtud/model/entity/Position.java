package qtud.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the "POSITION" database table.
 * 
 */
@Entity
@Table(name="POSITION")
@NamedQuery(name="Position.findAll", query="SELECT p FROM Position p")
public class Position implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="POS_ID")
	private String posId;

	private String description;

	@Column(name="POS_NAME")
	private String posName;

	private Integer status;

	//bi-directional many-to-one association to DeptUserPo
	@OneToMany(mappedBy="position")
	private Set<DeptUserPos> deptUserPos;

	public Position() {
	}

	public String getPosId() {
		return this.posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPosName() {
		return this.posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set<DeptUserPos> getDeptUserPos() {
		return this.deptUserPos;
	}

	public void setDeptUserPos(Set<DeptUserPos> deptUserPos) {
		this.deptUserPos = deptUserPos;
	}

	public DeptUserPos addDeptUserPos(DeptUserPos deptUserPos) {
		getDeptUserPos().add(deptUserPos);
		deptUserPos.setPosition(this);

		return deptUserPos;
	}

	public DeptUserPos removeDeptUserPos(DeptUserPos deptUserPos) {
		getDeptUserPos().remove(deptUserPos);
		deptUserPos.setPosition(null);

		return deptUserPos;
	}

}