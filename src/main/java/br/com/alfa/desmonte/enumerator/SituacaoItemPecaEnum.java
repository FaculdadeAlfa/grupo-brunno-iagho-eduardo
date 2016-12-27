package br.com.alfa.desmonte.enumerator;

public enum SituacaoItemPecaEnum {

	REUTILIZAVEL("Reutilizável, sem necessidade de reparo ou restauração"),
	RESTAURACAO("Passível de reutilização após reparo ou restauração"),
	DESCARTE("Não suscetível de reutilização, descartada no processo de desmontagem de veículos"),
	INEXISTENTE("Inexistente");

	private String descricao;

	private SituacaoItemPecaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}