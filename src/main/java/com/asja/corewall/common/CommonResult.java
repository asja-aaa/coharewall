package com.asja.corewall.common;

import com.asja.corewall.common.constant.RESULT;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description
 * @Author ASJA
 * @Create 2022-06-25 18:17
 */

@Data
@AllArgsConstructor
public class CommonResult<T> {

    private T data;

    private String msg;

    private Integer code;


    public static <T> CommonResult success(T data, String msg){
        return new CommonResult<T>(data,msg,0);
    }


    public static <T> CommonResult success(T data){
        return new CommonResult<T>(data, RESULT.SUCCESS.getMsg(),RESULT.SUCCESS.getCode());
    }

    public static <T> CommonResult failFast(RESULT result){
        return new CommonResult<T>(null,result.getMsg(),result.getCode());
    }


    public static <T> CommonResult failFast(RESULT result,T data){
        return new CommonResult<T>(data,result.getMsg(),result.getCode());
    }


}
