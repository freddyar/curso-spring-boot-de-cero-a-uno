package com.sventas.sventas.service;

import com.sventas.sventas.model.Cliente;
import com.sventas.sventas.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        Optional<Cliente> clienteOptional = clienteRepo.findById(id);
        return clienteOptional.orElse(null);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        clienteRepo.deleteById(id);
    }
}
