package com.imooc.miaosha.redis;

/**
 * @author shkstart
 * @date 2021/5/7 - 17:16
 */
public class UserKey extends BasePrefix {


    private UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("Name");
}
