package br.com.poo.objetos;

import br.com.poo.classes.Empregado;
import br.com.poo.classes.Setor;

public class UsarEmpregado {

	public static void main(String[] args) {

		Empregado Wagner = new Empregado();
		
		System.out.println(Wagner.salvar());
		Wagner.mensagem("Olá Wagner!");
		
		Setor vendas = new Setor();
		System.out.println(vendas.salvar());
		vendas.mensagem("Novo setor para a empresa");
		
	}

}
