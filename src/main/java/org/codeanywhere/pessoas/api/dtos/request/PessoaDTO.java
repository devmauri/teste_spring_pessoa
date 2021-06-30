package org.codeanywhere.pessoas.api.dtos.request;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codeanywhere.pessoas.api.enumeradores.EFuncaoTipo;
import org.codeanywhere.pessoas.api.models.Telefone;

/**Classe destinada para transferir dados entre objetos
 * já realizada a validação nos campos em individual. *
 * @author mauri
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    
    private Long id;
    
    @NotEmpty
    @Size(min = 2, max = 100)
    private String nome;
    
    @NotEmpty
    private String cpf;
    
    @NotEmpty
    private EFuncaoTipo funcao;
    
    @Valid
    @NotEmpty
    private List<Telefone> fones;
}
