package com.yc.model.Factory;

/**
 * @author cfun
 * @description 人类创建工厂
 * @date 2019-10-30
 */
public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human=null;
        try{
            human=(T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人类生成错误");
        }
        return (T)human;
    }
}
