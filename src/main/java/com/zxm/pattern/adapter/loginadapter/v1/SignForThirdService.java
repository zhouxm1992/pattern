package com.zxm.pattern.adapter.loginadapter.v1;

import com.zxm.pattern.adapter.loginadapter.ResultMsg;

public class SignForThirdService extends SiginService {


    public ResultMsg loginForQ(String openId){

        return login(openId,null);
    }

    public ResultMsg loginForWeChat(String openId){

        return null;
    }
}
