package kr.co.userinsight.tools.exception;

public class EntityNotValidParameterException extends RuntimeException implements ErrorHandlerExceptionAware {

    /** */
    private static final long serialVersionUID = 4617154154808000030L;

    private ErrorHandler errorHandler;

    /**
     *
     * @param
     * @param e
     */
    public EntityNotValidParameterException(Throwable e) {
        super(e);
    }

    /**
     *
     * @param message
     */
    public EntityNotValidParameterException(String message) {
        super(message);
    }

    /**
     *
     * @param message
     * @param e
     */
    public EntityNotValidParameterException(String message, Throwable e) {
        super(message, e);
    }

    /**
     *
     * @param errorKey
     * @param params
     */
    public EntityNotValidParameterException(String errorKey, Object[] params) {
        errorHandler = new ErrorHandler(errorKey, params);
    }

    @Override
    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }


    /**
     *
     * @return
     */
    public long getCode() {
        return errorHandler.getCode().getId();
    }
}
