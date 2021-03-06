package okhttp3.spring.boot;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(OkHttp3PoolProperties.PREFIX)
@Data
public class OkHttp3PoolProperties {

	public static final String PREFIX = "okhttp3.pool";
 
	/** 
	 * The maximum number of idle connections for each address. 
	 */
	private int maxIdleConnections = 200;
	/** 
	 * keep alive Duration. The default value is 30000 seconds. 
	 */
	private Duration keepAliveDuration = Duration.ofSeconds(30000);
	
}