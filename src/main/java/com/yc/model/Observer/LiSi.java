package com.yc.model.Observer;

/**
 * @author cfun
 * @description 李斯
 * @date 2019-11-14
 */
public class LiSi implements IliSi {
    @Override
    public void update(String str) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(str);
        System.out.println("李斯:汇报完毕...\n");
    }

    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯:报告，秦老板!韩非子有活动了--->"+reportContext);
    }
}
