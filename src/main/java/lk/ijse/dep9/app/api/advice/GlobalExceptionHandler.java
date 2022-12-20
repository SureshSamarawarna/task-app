package lk.ijse.dep9.app.api.advice;

import lk.ijse.dep9.app.dto.ErrorResponseMsgDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Throwable.class)
    public ErrorResponseMsgDTO uncaughtExceptions(Throwable t){
        t.printStackTrace();
        return new ErrorResponseMsgDTO(t.getMessage(),405);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponseMsgDTO validationExceptions(MethodArgumentNotValidException e){
        String msg = e.getFieldErrors().stream().map(err -> err.getField() + ": " + err.getDefaultMessage() + ",")
                .reduce((pre, cur) -> pre + cur).get();
        return new ErrorResponseMsgDTO(msg,400);
    }
}
