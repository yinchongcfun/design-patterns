package com.yc.model.Facade;

/**
 * @author cfun
 * @description 信件检查类
 * @date 2019-11-19
 */
public class Police {
    //检查信件，检查完毕后警察在信封上盖个戳:此信无病毒
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + " 信件已经检查过了...");
    }
}


