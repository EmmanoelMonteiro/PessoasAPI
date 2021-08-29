package one.digitalinnovation.pessoaapi.service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.pessoaapi.dto.request.PessoaDTO;
import one.digitalinnovation.pessoaapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.pessoaapi.entity.Pessoa;
import one.digitalinnovation.pessoaapi.exception.PessoaNotFoundException;
import one.digitalinnovation.pessoaapi.mapper.PessoaMapper;
import one.digitalinnovation.pessoaapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Gereciamento dos principais serviços disponíveis para
 * a os endpoints da API de Gestão de Pessoas
 * (createPessoa, listAll, findById, delete e updateById)
 */
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaService {

    private final PessoaMapper pessoaMapper = PessoaMapper.INSTANCE;
    private PessoaRepository pessoaRepository;

    public MessageResponseDTO createPessoa(PessoaDTO pessoaDTO) {
        Pessoa pessoaToSave = pessoaMapper.toModel(pessoaDTO);
        Pessoa savedPessoa = pessoaRepository.save(pessoaToSave);
        return createMessageResponse(savedPessoa.getId(), "Criada a pessoa com ID ");
    }

    public List<PessoaDTO> ListarPorUf(String uf) {
        List<Pessoa> allPessoas = pessoaRepository.buscarPelaUf(uf);
        return allPessoas.stream()
                .map(pessoaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<PessoaDTO> ListarPorNome(String nome) {
        List<Pessoa> allPessoas = pessoaRepository.findByNomeIgnoreCaseContaining(nome);
        return allPessoas.stream()
                .map(pessoaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<PessoaDTO> listAll() {
        List<Pessoa> allPessoas = pessoaRepository.findAll();
        return allPessoas.stream()
                .map(pessoaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PessoaDTO findById(Long id) throws PessoaNotFoundException {
        Pessoa pessoa = verifyIfExists(id);

        return pessoaMapper.toDTO(pessoa);
    }

    public void delete(Long id) throws PessoaNotFoundException {
        verifyIfExists(id);
        pessoaRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, PessoaDTO pessoaDTO) throws PessoaNotFoundException {
        verifyIfExists(id);

        Pessoa pessoaToUpdate = pessoaMapper.toModel(pessoaDTO);

        Pessoa updatedPessoa = pessoaRepository.save(pessoaToUpdate);
        return createMessageResponse(updatedPessoa.getId(), "Alterada a pessoa com ID ");
    }

    private Pessoa verifyIfExists(Long id) throws PessoaNotFoundException {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new PessoaNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
