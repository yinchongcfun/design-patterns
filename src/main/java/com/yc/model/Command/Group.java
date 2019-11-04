package com.yc.model.Command;

/**
 * @author cfun
 * @description 抽象组
 * @date 2019-11-04
 */
public abstract class Group {
    //甲乙讨论找到组
    public abstract void find();
    //被要求增加功能
    public abstract void add();
    //被要求删除功能
    public abstract void delete();
    //被要求修改功能
    public abstract void change();
    //被要求给出所有的变更计划
    public abstract void plan();
}
