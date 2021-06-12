package qtud.component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.Method;
import org.springframework.cache.interceptor.KeyGenerator;

public class CustomKeyGenerator implements KeyGenerator {
	private ObjectMapper om = new ObjectMapper();

	public Object generate(Object target, Method method, Object... params) {
		try {
			String key = String.format("%s_%s_%s", target.getClass().getSimpleName(), method.getName(),
					this.om.writeValueAsString(params).hashCode());
			return key;
		} catch (JsonProcessingException e) {
			return null;
		}
	}
}