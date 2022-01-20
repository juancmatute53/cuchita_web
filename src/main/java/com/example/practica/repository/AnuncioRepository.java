package com.example.practica.repository;


import com.example.practica.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public interface AnuncioRepository extends JpaRepository<Cliente, Serializable> {
}
