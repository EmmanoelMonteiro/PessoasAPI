package one.digitalinnovation.pessoaapi.utils;

import one.digitalinnovation.pessoaapi.dto.request.TelefoneDTO;
import one.digitalinnovation.pessoaapi.entity.Telefone;
import one.digitalinnovation.pessoaapi.enums.TiposTelefone;

public class TelefoneUtils {

    private static final String numero = "8498877-6655";
    private static final TiposTelefone tipo = TiposTelefone.CELULAR;
    private static final long id = 1L;

    public static TelefoneDTO createFakeDTO() {
        return TelefoneDTO.builder()
                .numero(numero)
                .tipo(tipo)
                .build();
    }

    public static Telefone createFakeEntity() {
        return Telefone.builder()
                .id(id)
                .numero(numero)
                .tipo(tipo)
                .build();
    }
}
