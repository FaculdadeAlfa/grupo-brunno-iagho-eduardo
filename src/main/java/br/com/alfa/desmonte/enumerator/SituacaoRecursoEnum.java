package br.com.alfa.desmonte.enumerator;

public enum SituacaoRecursoEnum {

    ABERTO("Aberto"), DEFERIDO("Deferido"), INDEFERIDO("Indeferido");

    private String descricao;

    private SituacaoRecursoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}