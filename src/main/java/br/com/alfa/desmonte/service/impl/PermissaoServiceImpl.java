package br.com.alfa.desmonte.service.impl;

import br.com.alfa.desmonte.model.Permissao;
import br.com.alfa.desmonte.service.PermissaoService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class PermissaoServiceImpl implements PermissaoService, Serializable {

    private static final long serialVersionUID = 1L;

    public List<Permissao> listarTodasPermissoesAtivas() {
        return null;
    }

    public void adicionar(Permissao entity) {

    }

    public void atualizar(Permissao entity) {

    }

    public void remover(Permissao entity) {

    }
}