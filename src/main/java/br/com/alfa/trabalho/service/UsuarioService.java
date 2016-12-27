package br.com.alfa.trabalho.service;

import br.com.alfa.trabalho.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario login(String login);

    List<Usuario> listarTodos();

    void registrarLogAcesso(Usuario usuario);

}