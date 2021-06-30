package org.codeanywhere.pessoas.api.mappers;

import org.codeanywhere.pessoas.api.dtos.request.PessoaDTO;
import org.codeanywhere.pessoas.api.models.Pessoa;
//import org.mapstruct.factory.Mappers;


/**Interface muito util para conversão de DTO <> model
 *OBS: Utilizada variável publica.
 * @author mauri
 */
public class PessoaMapper {
    
    public PessoaMapper(){
        
    }
   
    public Pessoa toModel(PessoaDTO pdto){
        Pessoa p=new Pessoa();
        
        p.setId(pdto.getId());
        p.setNome(pdto.getNome());
        p.setCpf(pdto.getCpf());        
        p.setFuncao(pdto.getFuncao());
        p.setFones(pdto.getFones());
        
        return p;
    }
    
    public PessoaDTO toDTO(Pessoa p){
        PessoaDTO pdto = new PessoaDTO();
        
        pdto.setId(p.getId());
        pdto.setNome(p.getNome());
        pdto.setCpf(p.getCpf());        
        pdto.setFuncao(p.getFuncao());
        pdto.setFones(p.getFones());
        
        return pdto;
    }    
    
}
