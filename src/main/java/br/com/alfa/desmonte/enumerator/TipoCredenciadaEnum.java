package br.com.alfa.desmonte.enumerator;

public enum TipoCredenciadaEnum {

    CLINICA("Clinica"),
    CFC("Centro de Formação de Condutores"),
    DESMONTE("Desmonte de Veículos");

    private String descricao;

    private TipoCredenciadaEnum(String descricao) {
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
