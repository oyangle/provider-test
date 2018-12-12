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

        String demo = "hello，这是第一个仅有架构的分布式系统，业务逻辑可在此架构上编写。用到的技术有如下：" +
                "git:源码托管地址，很赞。\r\n" +
                "jenkins:项目的自动化构建与打包部署，配置好git地址，可指定提交时触发构建。\r\n" +
                "nginx:代理与负载均衡，你现在的网址就是代理之后的。鉴于服务器容量有限，并未负载均衡；但单测时已实现。\r\n" +
                "zookeeper:服务注册中心。\r\n" +
                "dubbo:rpc远程调用的优秀框架。\r\n" +
                "mysql:持久化存储。采用阿里巴巴的DruidDataSource实现动态路由多数据库\r\n" +
                "redis:缓存的优秀代表，jedis操作已接入。\r\n" +
                "activeMQ:消息中间件，解耦应用间依赖。已实现多生产多消费的功能。\r\n" +
                "quartz：定时器，触发调度。\r\n" +
                "你所看到的这段话正是底层的另一应用服务提供。nice to meet you!";

        return demo;
    }
}
