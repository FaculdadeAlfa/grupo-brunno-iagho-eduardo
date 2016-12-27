package br.com.alfa.desmonte.view.controleAcesso;

import br.com.alfa.desmonte.model.Permissao;
import br.com.alfa.desmonte.service.PermissaoService;
import br.com.alfa.desmonte.view.comum.BaseView;
import org.primefaces.model.DualListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
@Scope("view")
public class PerfilView extends BaseView {

    private static final long serialVersionUID = 1L;

    @Autowired
    private PermissaoService permissaoService;

    private DualListModel<Permissao> dualListPermissoes;

    @PostConstruct
    public void init() {
    }

    public void adicionar() {

    }

    public void atualizar() {

    }

    public void prepararNovo() {

    }

    public void detalharPerfil() {

    }

    // GETS AND SETS
    public DualListModel<Permissao> getDualListPermissoes() {
        return dualListPermissoes;
    }

    public void setDualListPermissoes(DualListModel<Permissao> dualListPermissoes) {
        this.dualListPermissoes = dualListPermissoes;
    }
}