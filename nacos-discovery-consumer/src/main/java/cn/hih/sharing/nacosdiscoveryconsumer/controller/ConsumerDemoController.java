package cn.hih.sharing.nacosdiscoveryconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

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
    private RestTemplate restTemplate;

   /** @Autowired
    private LoadBalancerClient loadBalancerClient;
    */


    @GetMapping
    public String test(String name){
        /**
         ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
         URI uri = serviceInstance.getUri();
         return restTemplate.getForObject(uri+"/demo?name="+name,String.class);
         */
        return restTemplate.getForObject("http://nacos-discovery-provider/demo?name="+name,String.class);
    }
}
