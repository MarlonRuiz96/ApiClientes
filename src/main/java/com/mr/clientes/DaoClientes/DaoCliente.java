package com.mr.clientes.DaoClientes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mr.clientes.DaoClientes.Impl.IDaoClientes;
import com.mr.clientes.Entity.Cliente;


@Repository
@Transactional
public class DaoCliente implements IDaoClientes{

@PersistenceContext
private EntityManager em;
 
 @Transactional(readOnly = true)
 @Override
 
 public List<Cliente> findAll() {
	 
	 try {
         List<Cliente> listacliente = em.createQuery("FROM Cliente", Cliente.class).getResultList();
         return listacliente;
     } catch (Exception e) {
         e.printStackTrace();
         return null;
     }
 }

@Override
public Cliente save(Cliente clientes) {
	try {
        em.persist(clientes);
        return clientes;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

@Override
public Cliente update(Cliente clientes) {
	try {
        em.merge(clientes);
        return clientes;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

}
