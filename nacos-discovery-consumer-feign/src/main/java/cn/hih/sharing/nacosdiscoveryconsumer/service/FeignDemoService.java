package cn.hih.sharing.nacosdiscoveryconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hhai
 */
@FeignClient("nacos-discovery-provider")
public interface FeignDemoService {
    /**
     *
     * @param name
     * @return
     */
    @GetMapping("demo")
    String demo(@RequestParam("name") String name);
}
