package com.lhl.test.sofa.provider.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.lhl.test.sofa.services.HelloSyncService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author liuhonglin
 * @Date 2019/1/31 18:02
 */
@Component
@SofaService(interfaceType = HelloSyncService.class, bindings = {@SofaServiceBinding(bindingType = "bolt")})
public class HelloSyncServiceImpl implements HelloSyncService {

    @Override
    public String saySync(String name) {
        return "Hello " + name;
    }

}
