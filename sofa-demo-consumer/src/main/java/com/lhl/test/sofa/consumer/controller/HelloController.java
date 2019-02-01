package com.lhl.test.sofa.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.lhl.test.sofa.services.HelloSyncService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author liuhonglin
 * @Date 2019/2/1 14:14
 */
@RestController
@RequestMapping("/sofa-demo")
public class HelloController {

    @SofaReference(interfaceType = HelloSyncService.class, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private HelloSyncService helloSyncService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "sayTo", defaultValue = "sofa") String sayTo) {
        return helloSyncService.saySync(sayTo);
    }

}
