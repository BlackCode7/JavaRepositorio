package com.blackcode.venda.service;

import com.blackcode.venda.model.Cliente;
import com.blackcode.venda.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    // Injetando as dependências do SprintBoot
    private final ClientesRepository repository;
    @Autowired
    public ClienteService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }
    public void validarCliente(Cliente cliente){
        // Applicate validations
    }
}
