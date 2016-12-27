package br.com.alfa.desmonte.service.impl;

import br.com.alfa.desmonte.model.Cidade;
import br.com.alfa.desmonte.model.Endereco;
import br.com.alfa.desmonte.model.Estado;
import br.com.alfa.desmonte.service.EnderecoService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService, Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public List<Estado> listarTodosEstados() {
        return null;
    }

    @Override
    public List<Cidade> findCidadesByName(String name) {
        return null;
    }

    @Override
    public List<Cidade> listarCidadesPorEstado(Estado estado) {
        return null;
    }

    @Override
    public Endereco findEnderecoByCep(String cep) {
        return new Endereco();
    }

}
