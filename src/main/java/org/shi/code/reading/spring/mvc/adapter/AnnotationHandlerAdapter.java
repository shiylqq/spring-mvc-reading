package org.shi.code.reading.spring.mvc.adapter;

public class AnnotationHandlerAdapter implements HandlerAdapter {  
  
    public void handle(Object handler) {  
        ((AnnotationController)handler).doAnnotationHandler();  
    }  
  
    public boolean supports(Object handler) {  
          
        return (handler instanceof AnnotationController);  
    }  
  
}  