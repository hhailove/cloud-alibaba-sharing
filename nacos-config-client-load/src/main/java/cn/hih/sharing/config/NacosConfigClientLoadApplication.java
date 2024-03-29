package cn.hih.sharing.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hhai
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientLoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosConfigClientLoadApplication.class, args);
	}

}
