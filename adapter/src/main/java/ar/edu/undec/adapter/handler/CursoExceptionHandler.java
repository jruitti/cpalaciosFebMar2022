package ar.edu.undec.adapter.handler;

import curso.exception.CursoIncompletoException;
import curso.exception.CursoIncorrectoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CursoExceptionHandler {

    @ExceptionHandler({CursoIncompletoException.class, CursoIncorrectoException.class})
    ResponseEntity<?> handlerBadRequest(Exception ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
