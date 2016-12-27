package br.com.alfa.desmonte.service;

import br.com.alfa.desmonte.model.Perfil;

import java.util.List;

public interface PerfilService {

    List<Perfil> listarTodosPerfisAtivos();

    Perfil findPerfilByName(String name);

}