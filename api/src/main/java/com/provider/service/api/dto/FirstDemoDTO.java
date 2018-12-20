package com.provider.service.api.dto;

import java.io.Serializable;

/**
 * programname: provider_test
 * <p>
 * title: 用对象作为参数进行传递
 *
 * @author: yishao
 * <p>
 * created: 2018-12-20 15:45
 **/
public class FirstDemoDTO implements Serializable{

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
