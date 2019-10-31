package com.yc.model.Mediator;

/**
 * @author cfun
 * @description 采购管理
 * @date 2019-10-31
 */
public class Purchase extends AbstractColleague {

    //由于父类重载构造器,子类必须初始化
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }
    //不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}

