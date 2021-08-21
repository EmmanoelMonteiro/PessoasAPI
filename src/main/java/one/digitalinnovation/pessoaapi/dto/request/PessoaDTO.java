package one.digitalinnovation.pessoaapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Mapeamento dos tributos da Entidade Pessoa
 * para tratamento e transferência de dados pelo sistema.
 * É utilizada em PessoaService e PessoaServiceTest.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nome;

    @NotEmpty
    @CPF
    private String cpf;

    private String dataNascimento;

    @Valid
    @NotEmpty
    private List<TelefoneDTO> telefones;

    @Valid
    @NotEmpty
    private List<EnderecoDTO> enderecos;
}
