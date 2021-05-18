package zup.projectspring.cadastros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zup.projectspring.cadastros.model.Cliente;


@Repository
public interface ClientRepository extends JpaRepository<Cliente, Integer> {
    Cliente findById(long id);

}



