package cn.trusteye.base.process.exception;

/**
 * Created by Rayman on 2017/3/1.
 */
public class ExceptionCustom extends Exception{
    private String message;


    public ExceptionCustom(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
