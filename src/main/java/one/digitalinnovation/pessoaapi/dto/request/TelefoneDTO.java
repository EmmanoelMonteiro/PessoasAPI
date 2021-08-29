package one.digitalinnovation.pessoaapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.pessoaapi.enums.TiposTelefone;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Mapeamento dos tributos da Entidade Telefone
 * para tratamento e transferência de dados pelo sistema.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TiposTelefone tipo;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String numero;
}
