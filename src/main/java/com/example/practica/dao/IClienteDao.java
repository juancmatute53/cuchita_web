package com.example.practica.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.practica.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long> {
}
