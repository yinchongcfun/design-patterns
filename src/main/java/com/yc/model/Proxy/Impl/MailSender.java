package com.yc.model.Proxy.Impl;

import com.yc.model.Proxy.SendDao;

/**
 * @author cfun
 * @description 发送邮件
 * @date 2019-10-14
 */
public class MailSender implements SendDao {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
