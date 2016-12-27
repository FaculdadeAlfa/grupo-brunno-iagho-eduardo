package br.com.alfa.desmonte.enumerator;

public enum SituacaoCredenciamentoEnum {

	INDEFERIDO("Indeferido"),
	NOTIFICADO_PENDENCIAS("Notificado-Pendências"),
	AUTORIZADO_PROVISORIAMENTE("Autorizado Provisoriamente"),
	SUSPENSA("Suspensa"),
	AUTORIZADO("Autorizado");
	
	private String descricao;
	
	private SituacaoCredenciamentoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	} 
}