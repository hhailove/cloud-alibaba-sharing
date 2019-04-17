package cn.hih.sharing.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname: ConfigDemoController
 * @description: 获取配置信息控制器
 * @author: Mr.Huang
 * @date: 2019-03-20 16:28
 **/
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigDemoController {
    @Value("${test:空test}")
    private String str;

    @GetMapping
    public String test(){
        return str;
    }

}
