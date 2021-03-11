package jpabook.jpashop.exception;

import org.aspectj.weaver.ast.Not;

public class NotEnoughStcokException extends RuntimeException {

    public NotEnoughStcokException() {
    }

    public NotEnoughStcokException(String message) {
        super(message);
    }

    public NotEnoughStcokException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStcokException(Throwable cause) {
        super(cause);
    }
}
