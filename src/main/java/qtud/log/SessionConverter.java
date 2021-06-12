package qtud.log;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * @author  YenCVT.
 * @version 0.1
 *
 */
public class SessionConverter extends ClassicConverter {

  @Override
  public String convert(ILoggingEvent event) {
    RequestAttributes attrs = RequestContextHolder.getRequestAttributes();
    if (attrs != null) {
      return attrs.getSessionId();
    }
    return "NO_SESSION";
  }
}
