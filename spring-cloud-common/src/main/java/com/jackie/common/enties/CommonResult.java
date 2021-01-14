package com.jackie.common.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    //给一个没有数据的构造方法
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
