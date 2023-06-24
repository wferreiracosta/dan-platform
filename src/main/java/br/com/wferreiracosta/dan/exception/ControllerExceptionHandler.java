package br.com.wferreiracosta.dan.exception;

import br.com.wferreiracosta.dan.model.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.Timestamp;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(final ObjectNotFoundException e,
                                                        final HttpServletRequest request) {
        final var timestamp = new Timestamp(System.currentTimeMillis());
        final var err = new StandardError(NOT_FOUND.value(), e.getMessage(), timestamp);
        return ResponseEntity.status(NOT_FOUND).body(err);
    }

}
