package qtud.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * LoginRequest.
 *
 * @author YenCVT.
 * @version 0.1
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequest {
  private String username;
  private String password;

  public LoginRequest() {
    super();
  }

  public LoginRequest(String username, String password) {
    super();
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
