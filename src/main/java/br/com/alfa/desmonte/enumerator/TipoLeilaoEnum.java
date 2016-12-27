package br.com.alfa.desmonte.enumerator;

public enum TipoLeilaoEnum {

    PARTICULAR("Particular"),
    PUBLICO("Publico");

    private String descricao;

    private TipoLeilaoEnum(String descricao) {
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
