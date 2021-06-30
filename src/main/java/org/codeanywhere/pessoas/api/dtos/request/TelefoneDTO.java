package org.codeanywhere.pessoas.api.dtos.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.codeanywhere.pessoas.api.enumeradores.ETelefoneTipo;

/**Classe utilizada para transferir dados de telefone entre objetos
 *Validação já inseriada nos campos em individual.
 * @author mauri
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDTO {
    
    private Long id;
    
    @Enumerated(EnumType.STRING)
    private ETelefoneTipo tipo;
    
    @NotEmpty
    @Size(min = 10, max = 15)
    private String numero;
}
