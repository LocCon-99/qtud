package qtud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.HandshakeInterceptor;

import qtud.component.HttpHandshakeInterceptor;

/**
 * @author YenCVT
 * @version 0.1
 *
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	@Autowired
	private HttpHandshakeInterceptor handshakeInterceptor;

	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint(new String[]{"/api/notifications"}).setAllowedOrigins(new String[]{"*"})
				.withSockJS().setInterceptors(new HandshakeInterceptor[]{this.handshakeInterceptor});
	}

	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.setApplicationDestinationPrefixes(new String[]{"/notification"});
		config.enableSimpleBroker(new String[]{"/notification"});
		config.setUserDestinationPrefix("/user");
	}
}
