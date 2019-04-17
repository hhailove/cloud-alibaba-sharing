package cn.hih.sharing.nacosdiscoveryconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author hhai
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryConsumerWebfluxApplication {


    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerWebfluxApplication.class, args);
    }


    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder(){
        return  WebClient.builder();
    }
}
