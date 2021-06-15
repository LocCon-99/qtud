package qtud.model.dto.request;

public class ApplicationRequest {
	
	private String appId;
	private String appCode;
	private String appName;
	private String description;
	private Integer securityOption;
	private Integer status;
	
	
	
	
	
	public ApplicationRequest() {
		super();
	}


	public Integer getSecurityOption() {
		return securityOption;
	}

	public void setSecurityOption(Integer securityOption) {
		this.securityOption = securityOption;
	}

	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppCode() {
		return appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
