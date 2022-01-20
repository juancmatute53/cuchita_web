package com.example.practica.service;

import com.example.practica.entity.Cliente;
import com.example.practica.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Cliente")
public class AnuncioService {

   @Autowired
   ClienteRepository clienteRepository;

    @GetMapping(path = "/buscar")
    public List<Cliente> getAllClientes(){

        return clienteRepository.findAll();
    }

    @PostMapping(path = "/guardar")
    public Cliente saveCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public void deletCliente(@PathVariable("id") Long id){
        Optional<Cliente> cliente;
        cliente = clienteRepository.findById(id);
        if (cliente.isPresent()){
            Cliente borrar = cliente.get();
        }
        clienteRepository.delete(cliente.get());
    }


}
