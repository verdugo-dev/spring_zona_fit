package gm.zona_fit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.zona_fit.model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
