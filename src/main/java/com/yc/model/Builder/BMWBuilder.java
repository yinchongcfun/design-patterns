package com.yc.model.Builder;

import java.util.ArrayList;

/**
 * @author cfun
 * @description 宝马车组装者
 * @date 2019-10-30
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bwm = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bwm.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bwm;
    }
}
