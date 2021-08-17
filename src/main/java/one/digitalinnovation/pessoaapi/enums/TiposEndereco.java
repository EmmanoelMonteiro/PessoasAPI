package one.digitalinnovation.pessoaapi.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * Termos padrões para definir Tipos de Endereços possíveis.
 */
@Getter
@AllArgsConstructor
public enum TiposEndereco {
    RESIDENCIAL( "Residencial"),
    COMERCIAL( "Comercial");

    private final String description;
}
