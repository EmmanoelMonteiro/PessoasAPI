package one.digitalinnovation.pessoaapi.service;

import one.digitalinnovation.pessoaapi.dto.request.PessoaDTO;
import one.digitalinnovation.pessoaapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.pessoaapi.entity.Pessoa;
import one.digitalinnovation.pessoaapi.repository.PessoaRepository;
import one.digitalinnovation.pessoaapi.utils.PessoaUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static one.digitalinnovation.pessoaapi.utils.PessoaUtils.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PessoaServiceTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaService pessoaService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {
        PessoaDTO pessoaDTO = createFakeDTO();
        Pessoa expectedSavedPessoa = createFakeEntity();

        when(pessoaRepository.save(any(Pessoa.class))).thenReturn(expectedSavedPessoa);

        MessageResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPessoa.getId());
        MessageResponseDTO succesMessage = pessoaService.createPessoa(pessoaDTO);

        assertEquals(expectedSuccessMessage, succesMessage);
    }

    private MessageResponseDTO createExpectedMessageResponse(Long id) {
        return MessageResponseDTO
                .builder()
                .message("Criada a pessoa com ID " + id)
                .build();
    }
}
