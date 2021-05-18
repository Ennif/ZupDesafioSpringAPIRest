package zup.projectspring.cadastros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zup.projectspring.cadastros.model.Cliente;
import zup.projectspring.cadastros.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Cliente AdicionarUsuario(Cliente cliente){
        return clientRepository.save(cliente);
    }


}
