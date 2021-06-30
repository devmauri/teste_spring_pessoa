package org.codeanywhere.pessoas.api.execoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exceção caso não encontre a pessoas com o ID desejado.
 *
 * @author mauri
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PessoaNaoEncontadaException extends Exception{
    public PessoaNaoEncontadaException ( Long id ){
        //super("\n\n\n\tNão foi localizada pesso com id "+id+".\n\n\n");
        super("\n\n\n\tNão foi localizada pesso com id "+id+".\n\n\n", null);
    }
}
