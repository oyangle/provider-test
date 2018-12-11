package com.provider.service.api.impl;

import com.provider.service.api.FirstDemoApi;
import org.springframework.stereotype.Service;

/**
 * programname: provider_test
 * <p>
 * title: ceshi
 *
 * @author: yishao
 * <p>
 * created: 2018-12-10 14:41
 **/
@Service
public class FirstDemoApiImpl implements FirstDemoApi{
    public String queryOK() {
        return "hello,这是我的第一个分布式系统，融入了jenkins,mysql，nginx,redis,git,zookeeper.dubbo等" +
                "，\n见到你很高兴。";
    }
}
