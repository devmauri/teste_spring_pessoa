package org.codeanywhere.pessoas.api.enumeradores;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**Tipos possiveis de funções
 *
 * @author mauri
 */
@Getter
@AllArgsConstructor
public enum EFuncaoTipo {
    
    ATENDENTE ("Atendente"),
    GARCON ("Garcon"),    
    CHEFE("Chefe"),
    COZINHEIRO("Cozinheiro"),
    RH("Rh");
    
    private final String descricao;    
}

