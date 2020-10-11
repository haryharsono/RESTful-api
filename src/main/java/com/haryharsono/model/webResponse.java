package com.haryharsono.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class webResponse<T> {

    private int code;
    private String status;
    private T data;

}
