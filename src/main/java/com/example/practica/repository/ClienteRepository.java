package com.example.practica.repository;

import com.example.practica.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Serializable> {

    public List<Cliente> findByNombreAndApellido(String nombre, String apellido);
}
