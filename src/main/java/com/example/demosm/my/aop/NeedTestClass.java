package com.example.demosm.my.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NeedTestClass {
    public boolean value() default true;
}

//@Retention(RetentionPolicy.RUNTIME)
//@Target({ ElementType.TYPE, ElementType.METHOD })
//@Documented
//public @interface Monitor {
//
//    public boolean value() default true;
//}