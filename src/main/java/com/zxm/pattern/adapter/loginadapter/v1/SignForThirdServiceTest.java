package com.zxm.pattern.adapter.loginadapter.v1;

import com.zxm.pattern.adapter.loginadapter.ResultMsg;

public class SignForThirdServiceTest {

    public static void main(String[] args) {

        SignForThirdService signForThirdService = new SignForThirdService();
        ResultMsg resultMsg =  signForThirdService.loginForQ("asssdfsef");
        System.out.println(resultMsg.toString());

    }
}
