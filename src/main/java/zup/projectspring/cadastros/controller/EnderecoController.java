package zup.projectspring.cadastros.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import zup.projectspring.cadastros.model.Endereco;
import zup.projectspring.cadastros.model.Response;
import zup.projectspring.cadastros.model.dto.ClientsDto;

import zup.projectspring.cadastros.repository.ClientRepository;
import zup.projectspring.cadastros.repository.EnderecoRepository;
import zup.projectspring.cadastros.service.EnderecoService;

import java.util.Date;

@RestController
@RequestMapping(value = "endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    EnderecoService service;


    @GetMapping("/{clienteId}")
    public ResponseEntity<?> ListaEndCliente(@PathVariable(value = "clienteId") long clienteId) {
        ClientsDto clientsDto = service.EndClient(clienteId);
        if (clientsDto == null) {
            Response response = Response.builder().timestamp(new Date()).error("NOT_FOUND").
                    message("Lista de Endereço não encontrada").path("endereço/clienteId").status(404).build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
        return ResponseEntity.status(HttpStatus.OK).body(clientsDto);


    }

    @PostMapping()
    public ResponseEntity<Endereco> addEndereco(@RequestBody Endereco endereco) {
        Endereco newEndereco = service.adicionarEndereco(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).body(newEndereco);
    }

}

