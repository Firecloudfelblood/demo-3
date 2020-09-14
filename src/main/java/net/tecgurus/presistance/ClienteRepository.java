package net.tecgurus.presistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.tecgurus.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	public List<Cliente> findByNombre(String nombre);
}
