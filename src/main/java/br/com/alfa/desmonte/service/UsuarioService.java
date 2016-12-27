package br.com.alfa.desmonte.service;

import br.com.alfa.desmonte.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario login(String login);

    List<Usuario> listarTodos();

    void registrarLogAcesso(Usuario usuario);

}