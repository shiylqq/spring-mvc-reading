package org.shi.code.reading.spring.mvc.adapter;

public interface HandlerAdapter {
    public boolean supports(Object handler);
    public void handle(Object handler);
}
