package org.codeanywhere.pessoas.api.enumeradores;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**Tipo possiveis para telefones
 *
 * @author mauri
 */
@Getter
@AllArgsConstructor
public enum ETelefoneTipo {
    
    FIXO ("Fixo"),
    CELULAR ("Celular"),    
    COMERCIAL("Comercial");
    
    private final String descricao;    
}
