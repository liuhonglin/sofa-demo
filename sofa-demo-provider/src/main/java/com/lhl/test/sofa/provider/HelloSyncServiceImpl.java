package com.lhl.test.sofa.provider;

import com.lhl.test.sofa.services.HelloSyncService;

/**
 * @Description
 * @Author liuhonglin
 * @Date 2019/1/31 18:02
 */
public class HelloSyncServiceImpl implements HelloSyncService {

    @Override
    public String saySync(String name) {
        return "Hello " + name;
    }

}
