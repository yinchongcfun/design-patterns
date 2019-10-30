package com.yc.model.Service.Impl;

import com.yc.model.Service.SendDao;
import javafx.print.PaperSource;

import java.sql.SQLOutput;

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
