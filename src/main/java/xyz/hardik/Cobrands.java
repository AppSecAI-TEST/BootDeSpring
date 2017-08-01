package xyz.hardik;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cobrands {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String cobID;
	private String appId;
	private String cobName;
	
	
	public Cobrands(String cobID, String appId, String cobName) {
		super();
		this.cobID = cobID;
		this.appId = appId;
		this.cobName = cobName;
	}
	
	public Cobrands() {
		super();
	}
	
	public String getCobID() {
		return cobID;
	}
	public String setCobID(String cobID) {
		return this.cobID = cobID;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getCobName() {
		return cobName;
	}
	public void setCobName(String cobName) {
		this.cobName = cobName;
	}

}
