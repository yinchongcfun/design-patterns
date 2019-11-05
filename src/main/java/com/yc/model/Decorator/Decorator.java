package com.yc.model.Decorator;

/**
 * @author cfun
 * @description 修饰的抽象类
 * @date 2019-11-05
 */
public  abstract class Decorator extends SchoolReport {
    private SchoolReport sr;

    //构造函数，传递成绩单过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
