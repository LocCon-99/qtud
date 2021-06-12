package qtud.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * @author  YenCVT.
 * @version 0.1
 *
 */
public class ClientIPConverter extends ClassicConverter {
  private static final Logger LOGGER = LogManager.getLogger(ClientIPConverter.class);

  
  @Override
  public String convert(ILoggingEvent event) {

    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
        .getRequestAttributes();
    if (attributes == null) {
      return "CLIENT_IP_NULL";
    }
    HttpServletRequest request = attributes.getRequest();
    String result = "ip request: " + getIpAddr(request) + ",url-"
        + request.getRequestURL().toString();
    return result;
  }

  /**
   * get client ip request
   * 
   * @param  request
   * @return
   */
  private String getIpAddr(HttpServletRequest request) {
    String ipAddress = request.getHeader("x-forwarded-for");
    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getHeader("Proxy-Client-IP");
    }
    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
      ipAddress = request.getRemoteAddr();
      if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
        try {
          InetAddress inet = InetAddress.getLocalHost();
          ipAddress = inet.getHostAddress();
        } catch (UnknownHostException ex) {
          StringWriter sw = new StringWriter();
          PrintWriter pw = new PrintWriter(sw);
          ex.printStackTrace(pw);
          LOGGER.trace(sw.toString());
        }
      }
    }

    if (ipAddress != null && ipAddress.length() > 15) {
      if (ipAddress.indexOf(",") > 0) {
        ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
      }
    }
    return ipAddress;
  }
}
