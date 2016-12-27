package br.com.alfa.desmonte.service;

import br.com.alfa.desmonte.model.Parametro;

import java.util.List;

public interface ParametroService {

    public List<Parametro> listarTodos();

    Parametro buscarParametroPorNome(String parametro);
}