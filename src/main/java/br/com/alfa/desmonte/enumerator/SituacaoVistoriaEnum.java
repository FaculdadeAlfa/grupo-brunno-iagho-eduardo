package br.com.alfa.desmonte.enumerator;

public enum SituacaoVistoriaEnum {

	PENDENTE("Pendente"), ABERTA("Aberta"), EM_ANDAMENTO("Em andamento"), PENDENTE_APROVACAO("Pendente Aprovação"), APROVADO(
			"Aprovado"), REPROVADO("Reprovado");

	private String descricao;

	private SituacaoVistoriaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public Boolean getIsAprovado() {
		return (this.equals(SituacaoVistoriaEnum.APROVADO) ? true : false);
	}

	public Boolean getIsReprovado() {
		return (this.equals(SituacaoVistoriaEnum.REPROVADO) ? true : false);
	}

	public Boolean getIsNotAprovadoReprovado() {
		return (!this.equals(SituacaoVistoriaEnum.APROVADO) && !this.equals(SituacaoVistoriaEnum.REPROVADO) ? true
				: false);
	}
}