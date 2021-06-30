package org.codeanywhere.pessoas.api.repository;

import org.codeanywhere.pessoas.api.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**Interface utilizada para depois auxiliar no CRUD e outros controllers.
 *
 * @author mauri
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
