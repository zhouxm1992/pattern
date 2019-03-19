package com.zxm.pattern.adapter.objectadapter;

/**
 * 电源适配器
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5V() {

        int adapterIntput = ac220.outputAC220V();

        // 变压器
        int adaterOutput = adapterIntput/44;
        System.out.println("输入：" + adapterIntput +"V,输出：" + adaterOutput +"V");
        return adaterOutput;
    }
}
