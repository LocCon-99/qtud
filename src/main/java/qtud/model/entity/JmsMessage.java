package qtud.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the JMS_MESSAGES database table.
 * 
 */
@Entity
@Table(name="JMS_MESSAGES")
@NamedQuery(name="JmsMessage.findAll", query="SELECT j FROM JmsMessage j")
public class JmsMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long messageid;

	private String destination;

	@Lob
	private byte[] messageblob;

	private Long txid;

	private String txop;

	public JmsMessage() {
	}

	public long getMessageid() {
		return this.messageid;
	}

	public void setMessageid(long messageid) {
		this.messageid = messageid;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public byte[] getMessageblob() {
		return this.messageblob;
	}

	public void setMessageblob(byte[] messageblob) {
		this.messageblob = messageblob;
	}

	public Long getTxid() {
		return this.txid;
	}

	public void setTxid(Long txid) {
		this.txid = txid;
	}

	public String getTxop() {
		return this.txop;
	}

	public void setTxop(String txop) {
		this.txop = txop;
	}

}