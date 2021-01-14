package com.jackie.common.annotation.check;

import com.jackie.common.annotation.log.DcLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: jackie
 * @Date: 2021/1/11 17:45
 * @Version: 1.0.0
 * @function: 定义日志切面，获取日志请求信息
 */
@Aspect
@Component
@Slf4j
public class DcLogCheckAspect {

    @Pointcut("@annotation(com.jackie.common.annotation.log.DcLog)")
    public void controllerDcLog(){

    }


    @After(("execution(* com.jackie..*.*(..)) && @annotation(dcLog)"))
    public void excuLogData(DcLog dcLog, JoinPoint joinPoint){
        String value=dcLog.value();
        int code=dcLog.code();
        String type=dcLog.type();

        System.out.println("----------------------------------------------");
        System.out.println("-----value----"+value+"------------");
        System.out.println("-----code-----"+code+"------------");
        System.out.println("-----type-----"+type+"------------");
        System.out.println("----------------------------------------------");


    }







}
