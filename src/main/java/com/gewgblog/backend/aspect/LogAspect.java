package com.gewgblog.backend.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    // get the log
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.gewgblog.*.*(..))")
    public void log(){

    }

    /**
     * 执行log() AOP 之前, 执行的method
     */
    @Before("log()")
    public void doBefore(){
        logger.info("--------do before--------");
    }

    /**
     * 执行log() AOP之后, 执行的method
     */
    @After("log()")
    public void deAfter(){
        logger.info("--------do after--------");
    }

    @AfterReturning(returning = "result", pointcut = "log()")
    public void doAfterReturn(Object result){

    }
}
