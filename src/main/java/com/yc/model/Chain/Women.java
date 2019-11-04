package com.yc.model.Chain;

/**
 * @author cfun
 * @description 古代妇女
 * @date 2019-11-04
 */
public class Women implements IWomen {
    /*
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */

    //1是未结婚;
    //2是已经结婚的，而且丈夫健在;
    //3 是丈夫去世了
    private int type = 0;

    private String request = "";

    public Women(int _type, String _request) {
        this.type = _type; //为了便于显示，在这里做了点处理
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是:" + _request;
                break;
            case 2:
                this.request = "妻子的请求是:" + _request;
                break;
            case 3:
                this.request = "母亲的请求是:" + _request;
                break;
        }
    }


    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}