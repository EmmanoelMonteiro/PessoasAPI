package one.digitalinnovation.pessoaapi.utils;

import one.digitalinnovation.pessoaapi.dto.request.EnderecoDTO;
import one.digitalinnovation.pessoaapi.entity.Endereco;
import one.digitalinnovation.pessoaapi.enums.TiposEndereco;

public class EnderecoUtils {
    private static final String numero = "20";
    private static final TiposEndereco tipo = TiposEndereco.RESIDENCIAL;
    private static final long id = 1L;
    private static final String logradouro = "Rua Sturnino de brito";
    private static final String bairro = "Consolação";
    private static final String cidade = "Maranguape";
    private static final String uf = "SP";

    public static EnderecoDTO createFakeDTO() {
        return EnderecoDTO.builder()
                .numero(numero)
                .tipo(tipo)
                .logradouro(logradouro)
                .bairro(bairro)
                .cidade(cidade)
                .uf(uf)
                .build();
    }

    public static Endereco createFakeEntity() {
        return Endereco.builder()
                .id(id)
                .numero(numero)
                .tipo(tipo)
                .logradouro(logradouro)
                .bairro(bairro)
                .cidade(cidade)
                .uf(uf)
                .build();
    }
}
