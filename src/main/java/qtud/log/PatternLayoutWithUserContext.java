package qtud.log;

import ch.qos.logback.classic.PatternLayout;

/**
 * @author  YenCVT.
 * @version 0.1
 *
 */
public class PatternLayoutWithUserContext extends PatternLayout {
  static {
    PatternLayout.defaultConverterMap.put("user", UserConverter.class.getName());
    PatternLayout.defaultConverterMap.put("session", SessionConverter.class.getName());
    PatternLayout.defaultConverterMap.put("clientIp", ClientIPConverter.class.getName());
    PatternLayout.defaultConverterMap.put("serverIp",
        ServerIPConverter.class.getName());
  }
}
