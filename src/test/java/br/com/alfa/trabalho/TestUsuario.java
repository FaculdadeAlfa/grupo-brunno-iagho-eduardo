package br.com.alfa.trabalho;

import br.com.alfa.trabalho.model.Perfil;
import br.com.alfa.trabalho.model.Usuario;
import br.com.alfa.trabalho.service.PerfilService;
import br.com.alfa.trabalho.service.UsuarioService;
import br.com.alfa.trabalho.service.impl.PerfilServiceImpl;
import br.com.alfa.trabalho.service.impl.UsuarioServiceImpl;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestUsuario extends TestCase {

    @Test
    public void testarListaPerfis() {
        PerfilService perfilService = new PerfilServiceImpl();
        List<Perfil> perfis = perfilService.listarTodosPerfisAtivos();
        Assert.assertNotNull(perfis);
    }

    @Test
    public void testarListaUsuarios() {
        UsuarioService usuarioService = new UsuarioServiceImpl();
        List<Usuario> usuarios = usuarioService.listarTodos();
        Assert.assertNotNull(usuarios);
    }
}
