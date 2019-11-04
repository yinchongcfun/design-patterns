package com.yc.model.Chain;

/**
 * @author cfun
 * @description 儿子
 * @date 2019-11-04
 */
public class Son extends Handler{
    //儿子只处理母亲的请求
    public Son(){
        super(Handler.SON_LEVEL_REQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
