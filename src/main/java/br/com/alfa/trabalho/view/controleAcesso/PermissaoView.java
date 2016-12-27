package br.com.alfa.trabalho.view.controleAcesso;

import br.com.alfa.trabalho.model.Permissao;
import br.com.alfa.trabalho.view.comum.BaseView;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("view")
public class PermissaoView extends BaseView {

    private static final long serialVersionUID = 1L;
    private Permissao entidade;

    public void init() {

    }

    public void prepararNovo() {
        entidade = new Permissao();
    }
}