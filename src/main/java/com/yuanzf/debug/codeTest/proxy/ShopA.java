package com.yuanzf.debug.codeTest.proxy;

/**
 * @Author: yzf
 * @Date: 2019-01-17 16:29
 * @Desoription:
 */
public class ShopA implements Marketting {

    private String market;

    @Override
    public void buy(String market) {
        this.market = market;
    }

    @Override
    public String sell(String shop) {
        return "this shop A";
    }
}
