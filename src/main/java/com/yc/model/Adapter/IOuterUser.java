package com.yc.model.Adapter;

import java.util.Map;

/**
 * @author cfun
 * @description 劳动服务公司人员接口
 * @date 2019-11-05
 */
public interface IOuterUser {
    //基本信息，比如名称、性别、手机号码等
     public Map getUserBaseInfo();
    // 工作区域信息
    public Map getUserOfficeInfo();
    //用户的家庭信息
    public Map getUserHomeInfo();
}
