package com.zxm.pattern.adapter.loginadapter.v2;


import com.zxm.pattern.adapter.loginadapter.ResultMsg;
import com.zxm.pattern.adapter.loginadapter.v1.SiginService;

/**
 * 第三方登录自由适配
 */
public class PassportForThirdAdapter  extends SiginService implements IpasssportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        return null;
    }

    // 这里用到了简单工厂模式及策略模式
    private ResultMsg processLogin(String key,Class<? extends LoginAdapter>  clazz){

        try {

            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){

                return  adapter.login(key,adapter);
            }else {

                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
}
