package br.com.alfa.desmonte.enumerator;

public enum SituacaoSolicitacaoCredEnum {

    NOVA("Nova"),
    APROVADA("Aprovada"),
    INDEFERIDA("Indeferida"),
    APROVADA_PROVISORIAMENTE("Aprovada Provisóriamente");

    private String descricao;

    private SituacaoSolicitacaoCredEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}