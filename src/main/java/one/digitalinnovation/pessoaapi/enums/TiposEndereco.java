package one.digitalinnovation.pessoaapi.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TiposEndereco {
    RESIDENCIAL( "Residencial"),
    COMERCIAL( "Comercial");

    private final String description;
}
