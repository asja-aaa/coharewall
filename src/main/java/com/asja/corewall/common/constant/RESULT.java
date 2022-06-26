package com.asja.corewall.common.constant;

import lombok.Data;


public enum RESULT {

    SUCCESS(0,"success"),
    WALLHAVEN_ERROR(1,"wallhaven error");



    private Integer code;

    private String msg;

    RESULT(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    };

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
