package org.shi.code.reading.spring.mvc.controller.exception;

import org.shi.code.reading.spring.mvc.bean.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ResponseBody
    @ExceptionHandler(LianException.class)
    public Response handleMyException(){
        return Response.builder().code(500).msg("出错了").build();
    }
}
