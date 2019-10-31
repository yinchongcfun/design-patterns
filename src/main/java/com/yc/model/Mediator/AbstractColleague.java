package com.yc.model.Mediator;

/**
 * @author cfun
 * @description 抽象同事类
 * @date 2019-10-31
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    //父类重载构造器
    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
