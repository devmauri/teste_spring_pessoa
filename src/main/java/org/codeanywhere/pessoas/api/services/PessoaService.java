package org.codeanywhere.pessoas.api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.codeanywhere.pessoas.api.dtos.request.PessoaDTO;
import org.codeanywhere.pessoas.api.dtos.response.MensagemRespostaDTO;
import org.codeanywhere.pessoas.api.models.Pessoa;
import org.codeanywhere.pessoas.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.codeanywhere.pessoas.api.mappers.PessoaMapper;
import org.codeanywhere.pessoas.api.execoes.PessoaNaoEncontadaException;

/**Classe destinada a implementar o CRUD de pessoas.
 *
 * @author mauri
 */
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaService {
    
    private PessoaRepository prpst ;
    private final PessoaMapper pmpp = new PessoaMapper(); 
    
      
    /**Cria msg de retorno*/
    private MensagemRespostaDTO criarMsgResDTO (Long id, String msg){
        return MensagemRespostaDTO.builder()
                .mensagem( msg + id)
                .build();
    }
    
    
    private Pessoa verificaSeExiste(Long id) throws PessoaNaoEncontadaException{
        return prpst.findById(id)
                .orElseThrow(() -> new PessoaNaoEncontadaException(id));
                
    }
    /** @param  pdto PessoaDTO para criar
     * @return  Msg informando status operação.
     */
    public MensagemRespostaDTO criarPessoa(PessoaDTO pdto){
        //PessoaMapper pmpp = PessoaMapper.INSTANCIA;
        System.out.println("\nCria Pessoa "+pdto+"\n");
        
        Pessoa pSalvar = pmpp.toModel(pdto);
        
        Pessoa pSalva = prpst.save( pSalvar);
        
        return criarMsgResDTO(pSalva.getId(), "Criada pessoa com id ");
    }
    
 
    public List<PessoaDTO> listaPessoas (){
        List<Pessoa> pessoas = prpst.findAll();
        
        return pessoas.stream()
                .map(pmpp::toDTO)
                .collect(Collectors.toList());
    }
    
    public PessoaDTO listaPessoa (Long id) throws PessoaNaoEncontadaException {
        Pessoa localizada = verificaSeExiste(id);
         
        return pmpp.toDTO(localizada);
    }
    
    public void deletaPessoa (Long id) throws PessoaNaoEncontadaException {
       verificaSeExiste(id);
        prpst.deleteById(id);
    }
    
    
    public MensagemRespostaDTO atualizaPessoa(Long id, PessoaDTO pdto) throws PessoaNaoEncontadaException{
        //PessoaMapper pmpp = PessoaMapper.INSTANCIA;
        System.out.println("\nAtualizar Pessoa id "+id+"\n");
        
        verificaSeExiste(id);
        
        Pessoa pSalvar = pmpp.toModel(pdto);
        pSalvar.setId(id);   
        Pessoa pSalva = prpst.save( pSalvar);
        
        return criarMsgResDTO(pSalva.getId(), "Atualizada pessoa de id ");
    }
}
