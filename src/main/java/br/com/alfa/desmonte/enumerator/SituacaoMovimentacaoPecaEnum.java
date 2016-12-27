package br.com.alfa.desmonte.enumerator;

public enum SituacaoMovimentacaoPecaEnum {

    EM_RESTAURACAO("Peça em restauração"),
    RESTAURADA("Peça restaurada"),
    DESCARTADA("Peça não restaurada");

    private String descricao;

    private SituacaoMovimentacaoPecaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}