package com.lhl.test.sofa.consumer.filter;

import com.alipay.sofa.rpc.core.exception.SofaRpcException;
import com.alipay.sofa.rpc.core.request.SofaRequest;
import com.alipay.sofa.rpc.core.response.SofaResponse;
import com.alipay.sofa.rpc.ext.Extension;
import com.alipay.sofa.rpc.filter.AutoActive;
import com.alipay.sofa.rpc.filter.Filter;
import com.alipay.sofa.rpc.filter.FilterInvoker;

/**
 * @Description
 * @Author liuhonglin
 * @Date 2019/2/1 18:14
 */
// @Extension 注解+ @AutoActive 注解方式+配扩展文件方式  配置filter
@Extension("sofaContextFilter")
@AutoActive(providerSide = true, consumerSide = true)
public class SofaContextFilter extends Filter {


    @Override
    public SofaResponse invoke(FilterInvoker invoker, SofaRequest request) throws SofaRpcException {
        request.addRequestProp("RequestParam", "ContextParamValue");
        return invoker.invoke(request);
    }
}
