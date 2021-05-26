package com.imooc.miaosha.redis;

/**
 * @author shkstart
 * @date 2021/5/7 - 17:11
 */
public interface KeyPrefix {

    public int expireSeconds();
    public String getPrefix();

}
