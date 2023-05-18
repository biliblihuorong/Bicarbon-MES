package top.asshell.common.result;

public class Result <T>{
    private String msg;
    private Integer code;
    private T data;

    public static  <T> Result success(T data){
        Result<T> tResult = new Result<>();
        tResult.data=data;
        tResult.code=200;
        tResult.msg="success";
        return tResult;
    }
    public static  <T> Result success(T data,String msg){
        Result<T> tResult = new Result<>();
        tResult.data=data;
        tResult.code=200;
        tResult.msg=msg;
        return tResult;
    }
    public static  <T> Result error(String msg){
        Result<T> tResult = new Result<>();
        tResult.code=500;
        tResult.msg=msg;
        return tResult;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}