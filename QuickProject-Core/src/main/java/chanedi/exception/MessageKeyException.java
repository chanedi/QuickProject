package chanedi.exception;

import chanedi.context.ContextUtils;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

public class MessageKeyException extends RuntimeException {

    private Object[] messageArgs;

    public MessageKeyException() {
		super("unknown");
	}

	public MessageKeyException(String messageKey, Throwable cause, Object... messageArgs) {
		super(messageKey, cause);
        this.messageArgs = messageArgs;
	}

	public MessageKeyException(String messageKey, Object... messageArgs) {
		super(messageKey);
        this.messageArgs = messageArgs;
	}

	public MessageKeyException(Throwable cause) {
		super("unknown", cause);
	}
	
	public String getLocalizedMessage() {
        MessageSource messageSource = (MessageSource) ContextUtils.getBean("messageSource");
        if (messageSource == null) {
            return getMessage(); // TODO 为null的处理
        }

        String errorMessageKey = "error." +  getMessage();
		return messageSource.getMessage(errorMessageKey, messageArgs, "", LocaleContextHolder.getLocale());
    }
	
}
