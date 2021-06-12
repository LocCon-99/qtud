//package qtud.utils;
//
//import java.io.IOException;
//import java.net.URISyntaxException;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.http.client.methods.RequestBuilder;
//import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;
//
//public abstract class ProxyRequestTransformer {
//
//  protected ProxyRequestTransformer predecessor;
//
//  public abstract RequestBuilder transform(HttpServletRequest request) throws URISyntaxException, IOException, NoSuchRequestHandlingMethodException;
//
//  public void setPredecessor(ProxyRequestTransformer transformer) {
//    this.predecessor = transformer;
//  }
//}
