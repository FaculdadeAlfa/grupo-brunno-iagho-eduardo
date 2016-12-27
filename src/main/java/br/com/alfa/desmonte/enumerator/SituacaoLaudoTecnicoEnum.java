package br.com.alfa.desmonte.enumerator;

public enum SituacaoLaudoTecnicoEnum {
	
	EM_PROCESSO("Em Processo"),
	FINALIZADO("Finalizado");
	
	private String descricao;
	
	private SituacaoLaudoTecnicoEnum(String descricao) {
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