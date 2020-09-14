package net.tecgurus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.tecgurus.model.Cliente;
import net.tecgurus.presistance.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> consultarClientes(){
		
		List<Cliente> clientes = clienteRepository.findAll();
		
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
		
	}
	
	@GetMapping("/clientes/{nombre}")
	public ResponseEntity<List<Cliente>> consultaPorNombre(@RequestParam String nombre){
		List<Cliente> clientes = clienteRepository.findByNombre(nombre);
		
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);		
	}
}
