package br.com.alfa.desmonte.service.impl;

import br.com.alfa.desmonte.enumerator.TipoCredenciadaEnum;
import br.com.alfa.desmonte.model.Perfil;
import br.com.alfa.desmonte.service.PerfilService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService, Serializable {

    private static final long serialVersionUID = 1L;


    public void adicionar(Perfil perfil) {

    }

    public void atualizar(Perfil perfil) {

    }

    public void remover(Perfil perfil) {

    }

    public List<Perfil> listarTodosPerfisAtivos() {
        return null;
    }


    @Override
    public List<Perfil> listarPerfisByTipo(TipoCredenciadaEnum tipoCredenciada) {
        return null;
    }

    public Perfil findPerfilByName(String name) {
        return new Perfil();
    }
}