package com.yc.model.AbstractFactory;


/**
 * @author cfun
 * @description 人类创建工厂
 * @date 2019-10-30
 */
public interface HumanFactory {
    //制造一个黄色人种
    public Human createYellowHuman();
    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();
}
