package com.imooc.miaosha.redis;

/**
 * @author shkstart
 * @date 2021/5/7 - 17:12
 */
public abstract class BasePrefix implements KeyPrefix{

    private int expireSeconds;
    private String prefix;

    public BasePrefix( String prefix) {//0代表永不过期
        this(0, prefix);
    }
    @Override
    public int expireSeconds() {//默认0永不过期
        return expireSeconds;
    }

    public BasePrefix(int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    @Override
    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className+":"+prefix;
    }
}
