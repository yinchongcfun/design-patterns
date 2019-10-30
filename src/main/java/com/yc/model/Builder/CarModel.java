package com.yc.model.Builder;

import java.util.ArrayList;

/**
 * @author cfun
 * @description 车辆模型的抽象类
 * @date 2019-10-30
 */
public abstract class CarModel {
    //各个基本方法的执行顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engineBoom")) {
                this.engineBoom();
            }
        }
    }

    //把传递过来的值传递到类内
    final public void  setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }

    /*
    CarModel的设计原理是这样的，setSequence方法是允许客户自己设置一个顺序，
    是要先 启动响一下喇叭再跑起来，还是要先响一下喇叭再启动。
    对于一个具体的模型永远都固定 的，但是对N多个模型就是动态的了。
    在子类中实现父类的基本方法，run()方法读取 sequence，然后遍历sequence中的字符串，
    哪个字符串在先，就先执行哪个方法。
     */



}
