package br.com.alfa.desmonte.enumerator;

public enum TipoNotaFiscalEnum {

    ENTRADA("Entrada"),
    SAIDA("Saída");

    private String descricao;

    private TipoNotaFiscalEnum(String descricao) {
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
