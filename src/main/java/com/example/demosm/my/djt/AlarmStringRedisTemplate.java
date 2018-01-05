package com.example.demosm.my.djt;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by wensi on 2017-09-11.
 */
public abstract class AlarmStringRedisTemplate extends StringRedisTemplate {

    private String baseKey;

    public AlarmStringRedisTemplate(String baseKey, RedisConnectionFactory factory) {
        super(factory);
        this.baseKey = baseKey;
    }

    public AlarmStringRedisTemplate() {
        super();
    }

}
