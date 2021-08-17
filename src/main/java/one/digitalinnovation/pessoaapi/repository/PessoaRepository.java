package one.digitalinnovation.pessoaapi.repository;

import one.digitalinnovation.pessoaapi.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
