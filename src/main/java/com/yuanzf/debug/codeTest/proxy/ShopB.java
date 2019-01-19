package com.yuanzf.debug.codeTest.proxy;

/**
 * @Author: yzf
 * @Date: 2019-01-17 16:34
 * @Desoription:
 */
public class ShopB implements Marketting {

    private String market;

    @Override
    public void buy(String market) {
        this.market = market;
    }

    @Override
    public String sell() {
        return market;
    }
}
