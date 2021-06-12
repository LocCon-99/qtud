package qtud.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the JMS_USERS database table.
 * 
 */
@Entity
@Table(name="JMS_USERS")
@NamedQuery(name="JmsUser.findAll", query="SELECT j FROM JmsUser j")
public class JmsUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	private String userid;

	private String clientid;

	private String passwd;

	public JmsUser() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getClientid() {
		return this.clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}