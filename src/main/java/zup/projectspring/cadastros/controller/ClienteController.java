package zup.projectspring.cadastros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zup.projectspring.cadastros.model.Cliente;
import zup.projectspring.cadastros.service.ClientService;


@RestController
@RequestMapping
public class ClienteController {


   @Autowired
   private ClientService service;

   @PostMapping("/cliente")
   public ResponseEntity<Cliente> AddUsuario(@RequestBody Cliente cliente){
      Cliente newCliente = service.AdicionarUsuario(cliente);
      return ResponseEntity.status(HttpStatus.CREATED).body(newCliente);
   }

}