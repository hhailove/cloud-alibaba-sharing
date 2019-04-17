package cn.hih.sharing.nacosdiscoveryprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname: ProviderDemoController
 * @description: nacos提供者示例控制器
 * @author: Mr.Huang
 * @date: 2019-03-20 11:38
 **/
@RefreshScope
@RestController
@RequestMapping("demo")
public class ProviderDemoController {

    private final static Logger LOGGER = LoggerFactory.getLogger(ProviderDemoController.class);

    @Value("${server.port}")
    private int port;

    @GetMapping
    public String demo(String name){
        LOGGER.info("port:" + port);

        return "hello " + name;
    }

}
