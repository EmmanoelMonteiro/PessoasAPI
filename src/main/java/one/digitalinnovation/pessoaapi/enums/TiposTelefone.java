package one.digitalinnovation.pessoaapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@AllArgsConstructor
public enum TiposTelefone {

    CASA( "Casa"),
    CELULAR( "Celular"),
    COMERCIAL( "Comercial");

    private final String description;

}
