package one.digitalinnovation.pessoaapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TiposTelefone {

    CASA( "Casa"),
    CELULAR( "Celular"),
    COMERCIAL( "Comercial");

    private final String description;

}
