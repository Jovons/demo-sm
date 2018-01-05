package com.example.demosm.my.djt;

import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * Created by wensi on 2017-09-12.
 */
public class EventRedisTemplate extends AlarmStringRedisTemplate{

    public static final String BASE_KEY = "event";

    public EventRedisTemplate(RedisConnectionFactory factory) {
        this("event", factory);
    }

    public EventRedisTemplate(String baseKey, RedisConnectionFactory factory) {
        super(baseKey, factory);
    }

    public EventRedisTemplate() {}

}
