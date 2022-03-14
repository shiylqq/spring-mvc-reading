package org.shi.code.reading.spring.mvc.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request<T> {

    private T data;

}
