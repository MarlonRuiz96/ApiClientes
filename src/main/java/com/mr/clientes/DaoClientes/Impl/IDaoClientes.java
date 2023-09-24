package com.mr.clientes.DaoClientes.Impl;

import java.util.List;

import com.mr.clientes.Entity.Cliente;

public interface IDaoClientes {

	
	public List<Cliente> findAll();
    public Cliente save(Cliente clientes);
    public Cliente update(Cliente clientes);
}
