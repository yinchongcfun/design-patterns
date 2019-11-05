package com.yc.model.Decorator;

/**
 * @author cfun
 * @description HighScoreDecorator
 * @date 2019-11-05
 */
public class HighScoreDecorator extends Decorator {

    //父类重载构造器,子类必须初始化
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //我要汇报最高成绩
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    //我要在老爸看成绩单前告诉他最高成绩，否则等他一看，就抡起扫帚揍我，我哪里还有机会说啊 @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
