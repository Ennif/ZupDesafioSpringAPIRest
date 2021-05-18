package zup.projectspring.cadastros.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import zup.projectspring.cadastros.model.Cliente;
import zup.projectspring.cadastros.model.Endereco;
import zup.projectspring.cadastros.model.dto.ClientsDto;
import zup.projectspring.cadastros.repository.ClientRepository;
import zup.projectspring.cadastros.repository.EnderecoRepository;

import java.util.List;

@Service
@RestController
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ClientRepository clientRepository;

    public Endereco adicionarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }


    public ClientsDto EndClient(long clienteId) {
        List<Endereco> listaEndereco = enderecoRepository.findAllByclienteId(clienteId);
        Cliente cliente = clientRepository.findById(clienteId);
        if (cliente == null){
            return null;
        }
        return ClientsDto.builder().enderecos(listaEndereco).cpf(cliente.getCpf())
            .id(clienteId).email(cliente.getEmail()).name(cliente.getNome()).
            dNascimento(cliente.getNascimento()).build();

    }}

