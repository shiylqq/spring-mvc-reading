package org.shi.code.reading.spring.mvc.adapter;

public class SimpleHandlerAdapter implements HandlerAdapter {
  
  
    public void handle(Object handler) {  
        ((SimpleController)handler).doSimplerHandler();  
    }  
  
    public boolean supports(Object handler) {  
        return (handler instanceof SimpleController);  
    }  
  
}  