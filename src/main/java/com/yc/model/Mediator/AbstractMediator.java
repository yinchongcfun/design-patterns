package com.yc.model.Mediator;

/**
 * @author cfun
 * @description 抽象中介者
 * @date 2019-10-31
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator(){
        Purchase purchase = new Purchase(this);
        Sale sale = new Sale(this);
        Stock stock = new Stock(this);
    }

    //中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str,Object...objects);

}
