package org.codeanywhere.pessoas.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codeanywhere.pessoas.api.enumeradores.ETelefoneTipo;

/**Classe modelo utililizada para mepar as colunas
 * da tabela Telefone e seus relacionamentos no banco dedados.
 *Utiliza um enumerador para informar o tipo + validação.
 * @author maurissi
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Telefone {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ETelefoneTipo tipo;
    
    @Column(nullable = false)
    private String numero;
    
}
