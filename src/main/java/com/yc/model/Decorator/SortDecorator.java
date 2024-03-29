package com.yc.model.Decorator;

/**
 * @author cfun
 * @description 排名情况修饰
 * @date 2019-11-05
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //告诉老爸学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    //老爸看完成绩单后再告诉他，加强作用
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
