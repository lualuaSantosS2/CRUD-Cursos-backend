package school.sptech.exemplo_relacionamento.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class NaoContemCursosException extends RuntimeException{
    public NaoContemCursosException(){}
    public NaoContemCursosException(String mensagem){
        super(mensagem);
    }
}