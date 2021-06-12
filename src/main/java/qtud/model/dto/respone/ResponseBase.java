package qtud.model.dto.respone;

import java.io.Serializable;

public class ResponseBase implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 2537552770157631523L;
  private String errorCode = "0";
  private String errorDescription = null;
  private String status = "1";

  public ResponseBase() {
    super();
    // TODO Auto-generated constructor stub
  }

  public ResponseBase(String errorCode, String errorDescription) {
    super();
    this.status = "0";
    this.errorCode = errorCode;
    this.errorDescription = errorDescription;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
