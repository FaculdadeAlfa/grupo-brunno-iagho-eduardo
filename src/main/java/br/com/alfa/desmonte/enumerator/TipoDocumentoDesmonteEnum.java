package br.com.alfa.desmonte.enumerator;

public enum TipoDocumentoDesmonteEnum {

    CONTRATO_SOCIAL("Contrato Social", "contrato social do estabelecimento, que tenha como objeto social as atividades indicadas nos respectivos incisos; (Lei 15.276)"),
    INSCRICAO_CONTRIBUINTE("Inscrição Contribuinte", "inscrição como contribuinte do Imposto sobre Operações Relativas à Circulação de Mercadorias e sobre Prestações de Serviços de Transporte Interestadual e Intermunicipal e de Comunicação - ICMS; (Lei 15.276) "),
    ALVARA_MUNICIPAL_FUNCIONAMENTO("Alvará Funcionamento", "alvará municipal de funcionamento; (Lei 15.276)"),
    CADIN_ESTADUAL("CADIN Estadual", " declaração de inexistência de assentamento no Cadastro Informativo dos Créditos não Quitados de órgãos e entidades estaduais - CADIN ESTADUAL, do estabelecimento e de seus respectivos sócios. (Lei 15.276)"),
    RELACAO_EMPREGADOS("Relação Funcionários", "Apresentar relação de empregados e ajudantes, em caráter permanente ou eventual, devidamente qualificados. (Lei 15.276)");

    private String titulo;
    private String descricao;

    private TipoDocumentoDesmonteEnum(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }
}