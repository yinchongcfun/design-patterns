package com.yc.model.Decorator;

/**
 * @author cfun
 * @description 老爸查看成绩单
 * @date 2019-11-05
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport sr;
        sr=new FourthGradeSchoolReport();

        sr=new HighScoreDecorator(sr);

        sr=new SortDecorator(sr);

        sr.report();

        sr.sign("老三");
    }
}
