package com.yc.model.Command;

/**
 * @author cfun
 * @description 负责人
 * @date 2019-11-04
 */
public class Invoker {
    private Command command;

    //客户发出命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //执行客户的命令
    public void action() {
        this.command.execute();
    }

}
