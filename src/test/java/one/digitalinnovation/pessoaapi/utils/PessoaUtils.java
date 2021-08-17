package one.digitalinnovation.pessoaapi.utils;

import one.digitalinnovation.pessoaapi.dto.request.PessoaDTO;
import one.digitalinnovation.pessoaapi.entity.Pessoa;

import java.time.LocalDate;
import java.util.Collections;

public class PessoaUtils {

    private static final String nome = "Emmanoel Monteiro";
    private static final String cpf = "009.765.294-67";
    private static final long id = 1L;
    public static final LocalDate dataNascimento = LocalDate.of(1979, 06, 13);

    public static PessoaDTO createFakeDTO() {
        return PessoaDTO.builder()
                .nome(nome)
                .cpf(cpf)
                .dataNascimento("13-06-1979")
                .telefones(Collections.singletonList(TelefoneUtils.createFakeDTO()))
                .build();
    }

    public static Pessoa createFakeEntity() {
        return Pessoa.builder()
                .id(id)
                .nome(nome)
                .cpf(cpf)
                .dataNascimento(dataNascimento)
                .telefones(Collections.singletonList(TelefoneUtils.createFakeEntity()))
                .build();
    }
}
