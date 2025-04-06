package school.sptech.exemplo_relacionamento.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntidadeNaoEncontradaException extends RuntimeException{
    public EntidadeNaoEncontradaException(){}
    public EntidadeNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
