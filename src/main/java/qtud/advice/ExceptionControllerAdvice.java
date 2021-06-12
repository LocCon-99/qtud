package qtud.advice;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import javassist.NotFoundException;
import qtud.model.dto.respone.ResponseBase;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	private static final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

	@ExceptionHandler(NotFoundException.class)
	public ResponseBase notfoundException(NotFoundException ex) {
		ResponseBase responseMsg = new ResponseBase("1004", ex.getLocalizedMessage());
		return responseMsg;
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseBase nullPointerException(NullPointerException ex) {
		ResponseBase responseMsg = new ResponseBase("1000", ex.getLocalizedMessage());
		return responseMsg;
	}

	@ExceptionHandler(java.io.IOException.class)
	public ResponseBase ioException(java.io.IOException ex) {
		ResponseBase responseMsg = new ResponseBase("1001", ex.getLocalizedMessage());
		return responseMsg;
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseBase illegalArgumentException(IllegalArgumentException ex) {
		ResponseBase responseMsg = new ResponseBase("1004", ex.getLocalizedMessage());
		return responseMsg;
	}

	@ExceptionHandler(IndexOutOfBoundsException.class)
	public ResponseBase indexOutOfBoundsException(IndexOutOfBoundsException ex) {
		ResponseBase responseMsg = new ResponseBase("1009", ex.getLocalizedMessage());
		return responseMsg;
	}

	@ExceptionHandler(NumberFormatException.class)
	public ResponseBase numberFormatException(NumberFormatException ex) {
		ResponseBase responseMsg = new ResponseBase("1010", ex.getLocalizedMessage());
		return responseMsg;
	}

	@ExceptionHandler(Exception.class)
	public ResponseBase handleAllException(Exception ex, WebRequest request) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		ex.printStackTrace(pw);
		logger.error(sw.toString());
		ResponseBase responseMsg = new ResponseBase("1000", ex.getLocalizedMessage());
		return responseMsg;
	}
}
