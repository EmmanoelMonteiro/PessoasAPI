package one.digitalinnovation.pessoaapi.repository;

import one.digitalinnovation.pessoaapi.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Gerencia todas as operações lógicas de leitura e gravação
 * para entidade Pessoa. É utilizada em PessoaService e PessoaServiceTest
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
