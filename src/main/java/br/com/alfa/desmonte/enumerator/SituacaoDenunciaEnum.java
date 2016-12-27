package br.com.alfa.desmonte.enumerator;

public enum SituacaoDenunciaEnum {

	NOVA("Nova"), EM_ANALISE("Em Análise"), FINALIZADA("Finalizada");

	private String descricao;

	private SituacaoDenunciaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
