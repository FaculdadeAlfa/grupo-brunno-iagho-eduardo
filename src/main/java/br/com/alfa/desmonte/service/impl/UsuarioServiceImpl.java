package br.com.alfa.desmonte.service.impl;

import br.com.alfa.desmonte.model.Usuario;
import br.com.alfa.desmonte.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService, Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public Usuario login(String login) {
        return new Usuario();
    }

    public List<Usuario> listarTodos() {
        return null;
    }

    @Override
    public void registrarLogAcesso(Usuario usuario) {

    }

    public void adicionar(Usuario entity) {

    }

    public void atualizar(Usuario entity) {

    }

    public void remover(Usuario entity) {

    }
}