package com.example.demosm;

import com.example.demosm.my.aop.BusinessService;
import com.example.demosm.my.aop.Foo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@WebAppConfiguration
@SpringBootTest
public class AopTest {

    @Autowired
    private WebApplicationContext context;

    private BusinessService myBusinessService;


    @Test
    public void testThisPCD() {
        myBusinessService.logic();
    }

    @Test
    public void testAtAnnotationPCD() {
        myBusinessService.withAnnotation();
    }

    @Test
    public void testAtArgsPCD() {
        myBusinessService.logicWithAnnotatedArgs1(new Foo());
    }



    @Before
    public void before() {
        myBusinessService = (BusinessService) context.getBean("businessService");
    }
}
