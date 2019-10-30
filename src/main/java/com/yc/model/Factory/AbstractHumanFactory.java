package com.yc.model.Factory;

/**
 * @author cfun
 * @description 抽象人类工厂
 * @date 2019-10-30
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
