package br.com.alfa.desmonte.enumerator;

public enum TipoVinculoEnum {

	SOCIO_PROPRIETARIO("Sócio/Proprietário"),
	RESPONSAVEL_TECNICO("Responsável Técnico"),
	OPERADOR("Operador");
	
	private String descricao;
	
	private TipoVinculoEnum(String descricao) {
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
