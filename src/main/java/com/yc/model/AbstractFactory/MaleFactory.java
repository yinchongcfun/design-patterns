package com.yc.model.AbstractFactory;


/**
 * @author cfun
 * @description 生成男性的八卦驴
 * @date 2019-10-30
 */
public class MaleFactory  implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return (Human) new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return (Human) new MaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return (Human) new MaleYellowHuman();
    }
}
