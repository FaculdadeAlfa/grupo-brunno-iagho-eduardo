package br.com.alfa.desmonte.service;

import br.com.alfa.desmonte.enumerator.TipoCredenciadaEnum;
import br.com.alfa.desmonte.model.Perfil;

import java.util.List;

public interface PerfilService {

    List<Perfil> listarTodosPerfisAtivos();

    Perfil findPerfilByName(String name);

    List<Perfil> listarPerfisByTipo(TipoCredenciadaEnum tipoCredenciada);
}