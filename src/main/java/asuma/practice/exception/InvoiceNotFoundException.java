package asuma.practice.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.io.Serial;
@ControllerAdvice
public class InvoiceNotFoundException extends RuntimeException{


    @Serial
    private static final long serialVersionUID = 1L;


        public InvoiceNotFoundException(){
            super();
        }

        public InvoiceNotFoundException(String customMessage){
            super(customMessage);
        }



}
