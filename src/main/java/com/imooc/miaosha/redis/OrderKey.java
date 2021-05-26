package com.imooc.miaosha.redis;

/**
 * @author shkstart
 * @date 2021/5/7 - 17:16
 */
public class OrderKey extends BasePrefix {

    public OrderKey(String prefix) {
        super(prefix);
    }
    public static OrderKey getMiaoshaOrderByUidGid = new OrderKey("moug");
}
