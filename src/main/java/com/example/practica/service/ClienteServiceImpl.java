package com.example.practica.service;

import com.example.practica.dao.IClienteDao;
import com.example.practica.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao ClienteDao;

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findAll(){

        return (List<Cliente>)ClienteDao.findAll();
    }


}
