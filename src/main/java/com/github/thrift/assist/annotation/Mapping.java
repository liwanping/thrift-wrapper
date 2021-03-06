package com.github.thrift.assist.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by frank.li on 2017/3/27.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Mapping {
    Class<?> value() default Object.class;
    String method() default "";
    boolean generateFirstArg() default false;
}
