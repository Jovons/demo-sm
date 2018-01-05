package com.example.demosm.my.djt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JudgeItemServiceApi implements IJudgeItemServiceApi {

    private static final Logger LOG = LoggerFactory.getLogger(JudgeItemServiceApi.class);

    @Autowired
    private IJudgeService judgeService;
}
