package cn.hih.sharing.nacosdiscoveryconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @classname: ConsumerDemoController
 * @description: nacos消费者示例控制器
 * @author: Mr.Huang
 * @date: 2019-03-20 11:41
 **/
@RestController
@RequestMapping("test")
public class ConsumerDemoController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping
    public Mono<String> test(String name){
        return webClientBuilder.build()
                .get()
                .uri("http://nacos-discovery-provider/demo?name="+name)
                .retrieve()
                .bodyToMono(String.class);
    }
}
