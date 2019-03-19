package com.zxm.pattern.adapter.loginadapter.v2;

import com.zxm.pattern.adapter.loginadapter.ResultMsg;

public interface IpasssportForThird {

    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登陆
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone,String code);

    /**
     *  注册后登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg loginForRegist(String username,String password);
}
