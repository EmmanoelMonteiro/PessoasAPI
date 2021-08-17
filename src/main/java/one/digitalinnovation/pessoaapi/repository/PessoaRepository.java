package one.digitalinnovation.pessoaapi.repository;

import one.digitalinnovation.pessoaapi.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
/**
 * Gerencia todas as operações lógicas de leitura e gravação
 * para entidade Pessoa. É utilizada em PessoaService e PessoaServiceTest
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    @Query("SELECT p FROM Pessoa p inner join p.enderecos e where e.uf = :uf")
    List<Pessoa> buscarPelaUf(@Param("uf") String uf);

    //Outra forma de realizar a pesquisa #######################
    //@Query("SELECT p FROM Pessoa p where p.nome like %:nome%")
    //List<Pessoa> buscarPorNome(@Param("nome") String nome);
    List<Pessoa> findByNomeIgnoreCaseContaining(String nome);
}
