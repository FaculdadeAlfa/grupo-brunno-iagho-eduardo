package br.com.alfa.desmonte.enumerator;

public enum TipoCredenciamentoEnum {

    DESMONTE_E_COMERCIALIZACAO_PECAS(TipoCredenciadaEnum.DESMONTE, "Desmonte e Comercialização de Peças"),
    RECICLAGEM_IRRECUPERAVEIS(TipoCredenciadaEnum.DESMONTE, "Reciclagem  de Veículos Irrecuperáveis"),
    RECUPERACAO_PARTES_PECAS(TipoCredenciadaEnum.DESMONTE, "Recuperação de Partes e Peças de Veículos"),
    AUTOPECAS(TipoCredenciadaEnum.DESMONTE, "Comercialização de Peças"),

    CLINICA_MEDICA(TipoCredenciadaEnum.CLINICA, "Clínica Médica"),
    CLINICA_PSICOLOGICA(TipoCredenciadaEnum.CLINICA, "Clínica Psicológica"),
    CLINICA_MEDICA_PSICOLOGICA(TipoCredenciadaEnum.CLINICA, "Clínica Médica e Psicológica"),

    CFC_A(TipoCredenciadaEnum.CFC, "CFC A"),
    CFC_B(TipoCredenciadaEnum.CFC, "CFC B"),
    CFC_AB(TipoCredenciadaEnum.CFC, "CFC AB");

    private String descricao;
    private TipoCredenciadaEnum tipoCredenciada;

    private TipoCredenciamentoEnum(TipoCredenciadaEnum tipoCredenciada, String descricao) {
        this.descricao = descricao;
        this.tipoCredenciada = tipoCredenciada;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoCredenciadaEnum getTipoCredenciada() {
        return tipoCredenciada;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
