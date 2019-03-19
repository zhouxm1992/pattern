package com.zxm.pattern.adapter.loginadapter.v2;

import com.zxm.pattern.adapter.loginadapter.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
