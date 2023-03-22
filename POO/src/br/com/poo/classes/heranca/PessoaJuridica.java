package br.com.poo.classes.heranca;

//A Classe PessoaJuridica herda as propriedade e métodos da classe Pessoa, por isso usamos o comando extends(extender) para gerar a herança
public class PessoaJuridica extends Pessoa{
	
	private String razaoSocial;
	private String cnpj;
	public PessoaJuridica() {
	}
	public PessoaJuridica(String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	

}
