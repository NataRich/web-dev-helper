public class RespResult {
    private final int code;
    private final String message;
    private Object body;

    private RespResult(int code, String message, Object body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public RespResult(RespCode respCode) {
        this(respCode.value(), respCode.message(), new Object());
    }

    public RespResult(RespCode respCode, Object body) {
        this(respCode.value(), respCode.message(), body);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public static RespResult OK() {
        return new RespResult(RespCode.SUCCESS, new Object());
    }

    public static RespResult OK(Object body) {
        return new RespResult(RespCode.SUCCESS, body);
    }

    public static RespResult FAIL() {
        return new RespResult(RespCode.FAIL, new Object());
    }

    public static RespResult FAIL(Object body) {
        return new RespResult(RespCode.FAIL, body);
    }

    public static RespResult ERROR() {
        return new RespResult(RespCode.SERVER_ERROR, new Object());
    }

    public static RespResult ERROR(Object body) {
        return new RespResult(RespCode.SERVER_ERROR, body);
    }
}
