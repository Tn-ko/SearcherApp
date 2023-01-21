package com.api.peolpesearcher.exception;

public class SpringVoteException extends RuntimeException {
    public SpringVoteException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringVoteException(String exMessage) {
        super(exMessage);
    }

}
