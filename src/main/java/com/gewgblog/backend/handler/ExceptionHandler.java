package com.gewgblog.backend.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler {

    // get the log
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest requestURL, Exception e) throws Exception {
        logger.error("Request URL : {}. Exception: {}", requestURL.getRequestURL(), e);

        // 如果http status被指定, 则抛出异常
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
            throw e;
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("exceptionURL", requestURL.getRequestURL());
        mv.addObject("exception", e);
        mv.setViewName("error/error");

        return mv;
    }

}
