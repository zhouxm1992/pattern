package com.zxm.pattern.adapter.loginadapter.v2;

public class PassportTest  {
    public static void main(String[] args) {
        IpasssportForThird ipasssportForThird = new PassportForThirdAdapter();
        ipasssportForThird.loginForQQ("");
    }
}
