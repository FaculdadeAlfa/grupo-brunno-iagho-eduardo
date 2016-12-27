package br.com.alfa.desmonte.enumerator;

public enum TipoVistoriaEnum {

	CREDENCIAMENTO("Credenciamento"),
	RENOVACAO("Renovação");
	
	private String descricao;
	
	private TipoVistoriaEnum(String descricao) {
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
