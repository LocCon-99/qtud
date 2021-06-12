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
public class ServerIPConverter extends ClassicConverter {
  private static final Logger LOGGER = LogManager.getLogger(ServerIPConverter.class);

  @Override
  public String convert(ILoggingEvent event) {

    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
        .getRequestAttributes();
    if (attributes == null) {
      return "SERVER_IP_NULL";
    }
    HttpServletRequest request = attributes.getRequest();
    String result = "ip server: " + getIpAddr(request.getLocalAddr());
    return result;
  }

  private String getIpAddr(String ipAddress) {
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
    return ipAddress;
  }
}
