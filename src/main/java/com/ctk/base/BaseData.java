package com.ctk.base;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public class BaseData<T> {

    private int status;
    private String message;
    private T data;

    public BaseData() {

    }

    public BaseData(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
