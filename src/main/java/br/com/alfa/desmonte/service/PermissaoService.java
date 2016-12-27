package br.com.alfa.desmonte.service;

import br.com.alfa.desmonte.model.Permissao;

import java.util.List;

public interface PermissaoService {

    public List<Permissao> listarTodasPermissoesAtivas();
}