package br.com.alfa.desmonte.service;

import br.com.alfa.desmonte.model.Cidade;
import br.com.alfa.desmonte.model.Endereco;
import br.com.alfa.desmonte.model.Estado;

import java.util.List;

public interface EnderecoService {

    List<Estado> listarTodosEstados();

    List<Cidade> findCidadesByName(String name);

    List<Cidade> listarCidadesPorEstado(Estado estado);

    Endereco findEnderecoByCep(String cep);
}