package error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by manoj on 10/31/2017.
 */
@Slf4j
@ControllerAdvice
public class GlobalHandler {
    @ExceptionHandler(Exception.class)
    public void defaultHandler(){
        log.error("Exception");
    }
}
