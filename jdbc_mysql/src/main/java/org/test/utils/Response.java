package org.test.utils;

import java.io.Serializable;

/**
 * 响应类
 */
public class Response <T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
    private T data;

    private Response(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 操作成功，且需要返回数据
     * @param data 对象类
     * @return {code:200,message:“操作成功”,data:对象}
     */
    public static <T> Response<T> success(T data){
        return new Response<>(200, "操作成功", data);
    }

    /**
     * 操作成功，且无需返回数据
     * @return {code:200,message:“操作成功”,data:null}
     */
    public static <T> Response<T> success(){
        return success(null);
    }

    /**
     * 操作失败，需要返回状态码和报错信息
     * @param code 状态码
     * @param message 报错信息
     * @return {code:“状态码”,message:“报错信息”,data:null}
     */
    public static <T> Response<T> error(Integer code,String message){
        return new Response<>(code,message,null);
    }

    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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
