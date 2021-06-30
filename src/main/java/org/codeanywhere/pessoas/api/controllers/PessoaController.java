package org.codeanywhere.pessoas.api.controllers;


import java.util.List;
import org.codeanywhere.pessoas.api.dtos.request.PessoaDTO;
import org.codeanywhere.pessoas.api.dtos.response.MensagemRespostaDTO;
import org.codeanywhere.pessoas.api.services.PessoaService;
import javax.validation.Valid; 
import javax.ws.rs.DELETE;
import jdk.nashorn.internal.runtime.options.Option;

import lombok.AllArgsConstructor;
import org.codeanywhere.pessoas.api.execoes.PessoaNaoEncontadaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**Controller de Pessoas.
 *
 * @author mauri
 */
@RestController
@RequestMapping("/api/v1/pessoas")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaController {
    
    private PessoaService ps;  
    
    /**
     * Informa se servidor subiu.
     */
    @GetMapping("/ping")
    public String ping (){
        System.out.println("Pong no terminal");
        return "pong";
    }
    
    /**Cria pessoas e retorna msg
     * @param  pdto PessoaDTO pega no corpo da requisição.
     * @return Msg informando status da operação;
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemRespostaDTO criarPessoa (@RequestBody @Valid PessoaDTO pdto){
        return ps.criarPessoa(pdto);
    }
    
    /**
     * @return retorna uma lista com todas as pessoas cadastradas.
     */
    @GetMapping("/lista")
    public List<PessoaDTO> listaPessoas (){
        return ps.listaPessoas();
    }
    
    @GetMapping("/{id}")
    public PessoaDTO listaPessoa (@PathVariable Long id) throws PessoaNaoEncontadaException{
        
        return ps.listaPessoa(id);
    }
    
    @DeleteMapping ("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaPessoa (@PathVariable Long id) throws PessoaNaoEncontadaException{
        
        ps.deletaPessoa(id);
    }
    
    @PutMapping("/{id}")
    public MensagemRespostaDTO atualizaPessoa (@PathVariable Long id, @RequestBody @Valid PessoaDTO pdto) throws PessoaNaoEncontadaException {
        return ps.atualizaPessoa (id, pdto);
    }
    
}
