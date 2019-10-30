package com.yc.model.Builder;

import java.util.ArrayList;

/**
 * @author cfun
 * @description 奔驰车组装者
 * @date 2019-10-30
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benz =new BenzModel();


    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
