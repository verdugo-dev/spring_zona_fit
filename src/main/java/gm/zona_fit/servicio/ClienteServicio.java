package gm.zona_fit.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import gm.zona_fit.model.Cliente;
import gm.zona_fit.repositorio.ClienteRepositorio;

@Service
public class ClienteServicio implements IClienteServicio {

    private final ClienteRepositorio clienteRepositorio;

    ClienteServicio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepositorio.findAll();
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer idCliente) {
        Cliente cliente = clienteRepositorio.findById(idCliente).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente);
    }

}
