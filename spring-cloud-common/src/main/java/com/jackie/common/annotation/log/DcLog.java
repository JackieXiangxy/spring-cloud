package com.jackie.common.annotation.log;

import java.lang.annotation.*;

/**
 * @Author: jackie
 * @Date: 2021/1/11 17:38
 * @Version: 1.0.0
 * @function:
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DcLog {

    int code() default 0; //日志代码
    String type() default ""; //日志类型
    String value() default ""; //日志内容
}
