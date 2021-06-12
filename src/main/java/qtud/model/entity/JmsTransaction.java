package qtud.model.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the JMS_TRANSACTIONS database table.
 * 
 */
@Entity
@Table(name="JMS_TRANSACTIONS")
@NamedQuery(name="JmsTransaction.findAll", query="SELECT j FROM JmsTransaction j")
public class JmsTransaction implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	private long txid;

	public JmsTransaction() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getTxid() {
		return this.txid;
	}

	public void setTxid(long txid) {
		this.txid = txid;
	}

}