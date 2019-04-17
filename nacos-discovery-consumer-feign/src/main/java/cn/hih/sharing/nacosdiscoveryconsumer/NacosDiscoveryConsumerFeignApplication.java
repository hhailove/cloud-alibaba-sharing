package cn.hih.sharing.nacosdiscoveryconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author hhai
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryConsumerFeignApplication {


    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerFeignApplication.class, args);
    }


}
