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
        return "this is my firstDrmo.it is a remoute call from provider-test." +
                "you are so clever!";
    }
}
