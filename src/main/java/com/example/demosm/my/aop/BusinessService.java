package com.example.demosm.my.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BusinessService {


    public void logic() {
        log.info("service");
    }

    @NeedTest
    public void withAnnotation() {
        log.info("service");
    }

    public void logicWithArgs(String arg) {
        log.info("service arg:{}", arg);
    }

    public void logicWithAnnotatedArgs1(Foo c) {
        log.info("service");
    }

}
