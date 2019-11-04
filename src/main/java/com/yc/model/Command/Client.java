package com.yc.model.Command;

/**
 * @author cfun
 * @description 场景类
 * @date 2019-11-04
 */
public class Client {
    public static void main(String[] args) {
        //定义我们的接头人
        Invoker xiaoSan = new Invoker();
        //客户要求新增一项需求
        System.out.println("---客户要求增加新要求---");
        //客户给我下命令
        Command command = new AddRequirementCommand();
        //接头人接收命令
        xiaoSan.setCommand(command);
        //接头人执行命令
        xiaoSan.action();
    }
}
