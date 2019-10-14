package com.yc.model.Service.Impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.yc.model.Service.SendDao;

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
