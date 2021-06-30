package org.codeanywhere.pessoas.api.dtos.response;

import lombok.Builder;
import lombok.Data;

/**Utilizado para responder às solicitações das atividades
 *
 * @author mauri
 */
@Data
@Builder
public class MensagemRespostaDTO {
    
    private String mensagem;
    
}
