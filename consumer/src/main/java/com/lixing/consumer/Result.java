package com.lixing.consumer;

public class Result {
    private int act=0; //返回的代码 0：代表成功
    private Object message;//返回的结果集
    public int getAct() {
        return act;
    }
    public void setAct(int act) {
        this.act = act;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
