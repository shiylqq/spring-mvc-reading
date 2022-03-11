package org.shi.code.reading.spring.mvc.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Response {
    private Integer code;
    private String msg;
}
