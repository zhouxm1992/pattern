package com.zxm.pattern.adapter.loginadapter.v1;

import com.zxm.pattern.adapter.loginadapter.ResultMsg;

public class SiginService {

    /**
     * @param username
     * @param password
     * @return
     */
  public ResultMsg regist(String username, String password){

      return  new ResultMsg(200,"注册成功",null);
  }

    public ResultMsg login(String username,String password){

      ResultMsg resultMsg = new ResultMsg(200,"登陆成功",null);
        return  resultMsg;
    }
}
