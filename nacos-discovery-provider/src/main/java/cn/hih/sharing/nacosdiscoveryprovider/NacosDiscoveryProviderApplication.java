package cn.hih.sharing.nacosdiscoveryprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hhai
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDiscoveryProviderApplication.class, args);
	}

}
