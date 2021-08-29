package one.digitalinnovation.pessoaapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.pessoaapi.enums.TiposEndereco;

import javax.persistence.*;

/**
 * Representa a Entidade Endereço na base de dados.
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TiposEndereco tipo;

    @Column(nullable = false)
    private String logradouro;

    private String numero;

    private String bairro;

    private String cidade;

    private String uf;

}