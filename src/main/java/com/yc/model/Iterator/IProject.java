package com.yc.model.Iterator;

/**
 * @author cfun
 * @description 项目信息接口
 * @date 2019-11-05
 */
public interface IProject {
    //增加项目
    public void add(String name,int num,int cost);
    //从老板这里看到的就是项目信息
    public String getProjectInfo();
    //获得一个可以被遍历的对象
    public IProjectIterator iterator();
}
