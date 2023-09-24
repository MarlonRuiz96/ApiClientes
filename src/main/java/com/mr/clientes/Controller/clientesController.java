package com.mr.clientes.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mr.clientes.DaoClientes.Impl.IDaoClientes;
import com.mr.clientes.Entity.Cliente;



@RestController
@RequestMapping(value = ("/clientesapi"))
public class clientesController {
	
	
	@Autowired
    private IDaoClientes daoClientes;
	
	
	@GetMapping(value = "/mostrar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> getClientes() {
		return daoClientes.findAll();
	}
	
	@PostMapping(value = "/mostrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		return daoClientes.save(cliente);
		
	}
	
	@PutMapping(value = "/mostrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente update(@RequestBody Cliente cliente){
		return daoClientes.update(cliente);
	}
}
