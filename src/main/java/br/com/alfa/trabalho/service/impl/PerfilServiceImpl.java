package br.com.alfa.trabalho.service.impl;

import br.com.alfa.trabalho.model.Perfil;
import br.com.alfa.trabalho.service.PerfilService;
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

    public Perfil findPerfilByName(String name) {
        return new Perfil();
    }
}