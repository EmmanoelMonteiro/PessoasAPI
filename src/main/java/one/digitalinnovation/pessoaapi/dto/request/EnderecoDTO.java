package one.digitalinnovation.pessoaapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.pessoaapi.enums.TiposEndereco;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

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
