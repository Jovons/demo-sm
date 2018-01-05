package com.example.demosm.my.djt;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JudgeService implements IJudgeService {

    private static final Logger logger = LoggerFactory.getLogger(JudgeService.class);

    @Autowired
    private EventRedisTemplate redisTemplate;
}
