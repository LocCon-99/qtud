package qtud.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the JMS_SUBSCRIPTIONS database table.
 * 
 */
@Entity
@Table(name="JMS_SUBSCRIPTIONS")
@NamedQuery(name="JmsSubscription.findAll", query="SELECT j FROM JmsSubscription j")
public class JmsSubscription implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	private String clientid;

	private String selector;

	private String subname;

	private String topic;

	public JmsSubscription() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClientid() {
		return this.clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
	}

	public String getSelector() {
		return this.selector;
	}

	public void setSelector(String selector) {
		this.selector = selector;
	}

	public String getSubname() {
		return this.subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}