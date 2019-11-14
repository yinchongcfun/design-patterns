package com.yc.model.Observer;

/**
 * @author cfun
 * @description 具体被观察者
 * @date 2019-11-14
 */
public class HanFeiZi implements IHanFeiZi{

    //韩非子是否在吃饭，作为监控的判断标准
    private boolean isHavingBreakfast = false;
    //韩非子是否在娱乐
    private boolean isHavingFun = false;

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.isHavingBreakfast =true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.isHavingFun = true;
    }
}
