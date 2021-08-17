package one.digitalinnovation.pessoaapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * Termos padrões para definir Tipos de Telefones possíveis.
 */
@Getter
@AllArgsConstructor
public enum TiposTelefone {

    CASA( "Casa"),
    CELULAR( "Celular"),
    COMERCIAL( "Comercial");

    private final String description;

}
