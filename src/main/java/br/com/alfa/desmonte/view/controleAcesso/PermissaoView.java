package br.com.alfa.desmonte.view.controleAcesso;

import br.com.alfa.desmonte.model.Permissao;
import br.com.alfa.desmonte.view.comum.BaseView;
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