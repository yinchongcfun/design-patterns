package com.yc.model.AbstractFactory;


/**
 * @author cfun
 * @description 生成女性的八卦驴
 * @date 2019-10-30
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleYellowHuman();
    }
}
