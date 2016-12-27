package br.com.alfa.desmonte.enumerator;

public enum SituacaoDesmonteInfracaoEnum {

    PERIODO_RECURSAL("Periodo recursal"),
    INDEFERIDA("Indeferida"),
    DEFERIDA("Deferida");

    private String descricao;

    private SituacaoDesmonteInfracaoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}