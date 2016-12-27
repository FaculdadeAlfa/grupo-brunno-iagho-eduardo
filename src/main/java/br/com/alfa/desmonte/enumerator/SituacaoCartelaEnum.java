package br.com.alfa.desmonte.enumerator;

public enum SituacaoCartelaEnum {

	ESTOQUE("Estoque"), PENDENTE_APROVACAO("Pendente Aprovação"), DISPONIVEL("Disponível"), UTILIZADA("Utilizada"), DESCARTADA(
			"Descartada");

	private String descricao;

	private SituacaoCartelaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}