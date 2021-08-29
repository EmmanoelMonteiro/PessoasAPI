package one.digitalinnovation.pessoaapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.pessoaapi.enums.TiposEndereco;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Mapeamento dos tributos da Entidade Endereco
 * para tratamento e transferência de dados pelo sistema.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TiposEndereco tipo;

    @NotEmpty
    @Size(min = 1, max = 200)
    private String logradouro;

    private String numero;

    private String bairro;

    private String cidade;

    @Size(max = 2)
    private String uf;
}
