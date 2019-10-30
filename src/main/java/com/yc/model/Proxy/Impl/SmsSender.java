package com.yc.model.Proxy.Impl;

import com.yc.model.Proxy.SendDao;

/**
 * @author cfun
 * @description 短信模板发送
 * @date 2019-10-14
 */
public class SmsSender implements SendDao
{
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }

}
