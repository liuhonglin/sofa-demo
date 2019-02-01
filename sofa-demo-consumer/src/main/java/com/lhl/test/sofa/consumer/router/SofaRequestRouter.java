package com.lhl.test.sofa.consumer.router;

import com.alipay.sofa.rpc.bootstrap.ConsumerBootstrap;
import com.alipay.sofa.rpc.client.ProviderInfo;
import com.alipay.sofa.rpc.client.Router;
import com.alipay.sofa.rpc.core.request.SofaRequest;
import com.alipay.sofa.rpc.ext.Extension;
import com.alipay.sofa.rpc.filter.AutoActive;

import java.util.List;

/**
 * @Description
 * @Author liuhonglin
 * @Date 2019/2/1 18:32
 */
@Extension("customerRouter")
@AutoActive(consumerSide = true)
public class SofaRequestRouter extends Router {

    /**
     * init 参数 ConsumerBootstrap 是引用服务的包装类，能够拿到 ConsumerConfig ，代理类，服务地址池等对象
     * @param consumerBootstrap
     */
    @Override
    public void init(ConsumerBootstrap consumerBootstrap) {
        super.init(consumerBootstrap);

    }

    /**
     * needToLoad 表示是否生效该 Router
     * @param consumerBootstrap
     * @return
     */
    @Override
    public boolean needToLoad(ConsumerBootstrap consumerBootstrap) {
        return false;
    }

    /**
     * route 方法即筛选地址的方法
     * @param sofaRequest
     * @param list
     * @return
     */
    @Override
    public List<ProviderInfo> route(SofaRequest sofaRequest, List<ProviderInfo> list) {

        return list;
    }
}
