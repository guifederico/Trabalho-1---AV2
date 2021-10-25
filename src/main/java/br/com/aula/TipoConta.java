package br.com.aula;

public enum TipoConta {
	CORRENTE("Corrente", 1), POUPANCA("Poupanca", 2);

	private int value;
	private String descricao;

	TipoConta(String desc, int value) {
		this.descricao = desc;
		this.value = value;

	}

	public Integer getValue() {
		return value;
	}

	public String getDescricao() {

		return descricao;
	}

	public static TipoConta getTipoContaByValue(int value) {
		for (final TipoConta tipo : values()) {
			if (tipo.value == value) {
				return tipo;
			}
		}

		return null;
	}

	public static TipoConta getTipoContaByDescricao(String descricao) {

		for (final TipoConta tipo : values()) {
			if (tipo.descricao.equals(descricao)) {
				return tipo;
			}
		}

		return null;

	}
}
