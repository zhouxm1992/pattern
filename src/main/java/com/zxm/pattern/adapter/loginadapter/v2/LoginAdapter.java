package com.zxm.pattern.adapter.loginadapter.v2;

import com.zxm.pattern.adapter.loginadapter.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
