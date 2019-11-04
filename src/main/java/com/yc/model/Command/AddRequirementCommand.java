package com.yc.model.Command;

/**
 * @author cfun
 * @description 增加需求的命令
 * @date 2019-11-04
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }
}
