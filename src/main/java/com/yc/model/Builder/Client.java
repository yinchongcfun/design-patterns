package com.yc.model.Builder;

import java.util.ArrayList;

/**
 * @author cfun
 * @description 场景
 * @date 2019-10-30
 */
public class Client {
    public static void main(String[] args) {
        /*
         * 客户告诉XX公司，我要这样一个模型，
         * 然后XX公司就告诉我老大 * 说要这样一个模型，这样一个顺序，然后我就来制造
         */

       //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engineboom");
        //客户要求，run的时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来 //我们把这个顺序赋予奔驰车
        //要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();
    }
}
