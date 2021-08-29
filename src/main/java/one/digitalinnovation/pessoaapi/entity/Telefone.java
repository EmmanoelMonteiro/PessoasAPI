package one.digitalinnovation.pessoaapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.pessoaapi.enums.TiposTelefone;

import javax.persistence.*;

/**
 * Representa a Entidade Telefone na base de dados.
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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TiposTelefone tipo;

    @Column(nullable = false)
    private String numero;
}
