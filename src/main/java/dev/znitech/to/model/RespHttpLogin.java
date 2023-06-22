package dev.znitech.to.model;

public class RespHttpLogin {
    private final String message;
    private final String status;

    public RespHttpLogin(String message, String status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
