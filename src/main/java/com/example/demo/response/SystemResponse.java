package com.example.demo.response;

/**
 * Created by khent on 5/30/2018.
 */
public class SystemResponse {
    private boolean flag;
    private String msg;

    public SystemResponse(){


    }

    public SystemResponse(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
