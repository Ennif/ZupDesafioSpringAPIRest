package zup.projectspring.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zup.projectspring.cadastros.model.Endereco;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Integer>{
    List<Endereco> findAllByclienteId(long clienteId);

}
