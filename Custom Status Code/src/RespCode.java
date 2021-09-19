public enum RespCode {
    // 1xxx: Informational

    // 2xxx: Success
    SUCCESS(2000, "OK"),
    ACCEPTED(2001, "Request is accepted"),
    RECEIVED(2002, "Request is received"),
    TOKEN_SENT(2003, "Token is sent"),
    CODE_SENT(2004, "Code is sent"),

    // 3xxx: Redirection

    // 4xxx: Client Error
    FAIL(4000, "The request failed"),
    DENIED(4001, "The request was denied"),
    NOT_ALLOWED(4002, "The request was unauthorized"),
    INVALID_PARAM(4003, "The parameters in the request were invalid"),
    EXPIRED_PARAM(4004, "The parameters in the request were expired"),
    AUTH_FAIL(4005, "The authentication or authorization failed"),
    INCORRECT_PASS(4006, "The password was incorrect"),
    RESOURCE_NOT_FOUND(4007, "The requested resource was not found"),
    USER_NOT_FOUND(4008, "The user was not found"),
    CLIENT_TIME_OUT(4009, "The request timed out"),

    // 5xxx: Server Error
    SERVER_ERROR(5000, "The server encountered an unexpected error"),
    DATABASE_ERROR(5001, "The database encountered an unexpected error"),
    CACHE_ERROR(5002, "The cache server encountered an unexpected error"),
    DB_FETCH_FAIL(5003, "The database fetch failed"),
    DB_INSERT_FAIL(5004, "The database insertion failed"),
    DB_UPDATE_FAIL(5005, "The database update failed"),
    DB_DELETE_FAIL(5006, "The database deletion failed"),
    ;

    private final int code;
    private final String message;

    RespCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int value() {
        return code;
    }

    public String message() {
        return message;
    }
}
