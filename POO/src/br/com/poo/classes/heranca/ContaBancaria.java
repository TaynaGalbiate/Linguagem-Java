package br.com.poo.classes.heranca;

public abstract class ContaBancaria {
	
	private Long numeroBanco;
	private int agencia;
	private Long numeroConta;
	private String titular;
	private double saldo;
	
	public String verificarSaldo () {
		return "Seu saldo é: " + saldo;
	}

	public String depositar(double valor) {
		saldo += valor;
		return "Depósito efetuado com sucesso!";
	}
	public String sacar(double valor) {
		saldo -= valor;
		return "Saque realizado com sucesso!";
	}

	public Long getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(Long numeroBanco) {
		this.numeroBanco = numeroBanco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Long getNumeroconta() {
		return numeroConta;
	}

	public void setNumeroconta(Long numeroconta) {
		this.numeroConta = numeroconta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
