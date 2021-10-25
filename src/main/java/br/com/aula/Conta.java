package br.com.aula;

public class Conta {

	private Cliente cliente;
	private int numeroConta;
	private int saldo;
	private TipoConta tipoConta;

	public Conta(Cliente cliente, int numeroConta, int saldo, TipoConta tipoConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}

	public void creditar(int valor) {
		this.saldo = this.getSaldo() + valor;
	}

	public void debitar(int valor) {
		this.saldo = this.getSaldo() - valor;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getSaldo() {
		return saldo;
	}
}
