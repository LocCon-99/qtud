package qtud.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the SQLN_PROF_PROFILES database table.
 * 
 */
@Entity
@Table(name="SQLN_PROF_PROFILES")
@NamedQuery(name="SqlnProfProfile.findAll", query="SELECT s FROM SqlnProfProfile s")
public class SqlnProfProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="PROJ_ID")
	private String projId;

	@Column(name="PROJ_COMMENT")
	private String projComment;

	@Column(name="PROJ_NAME")
	private String projName;

	public SqlnProfProfile() {
	}

	public String getProjComment() {
		return this.projComment;
	}

	public void setProjComment(String projComment) {
		this.projComment = projComment;
	}

	public String getProjId() {
		return this.projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return this.projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

}