package br.com.poo.objetos;

import java.sql.Date;

import br.com.poo.classes.Cliente;

public class CriarCliente {

	public static void main(String[] args) {

		//Para criar um objeto irei fazer a instância da classe Cliente
		Cliente cliente1 = new Cliente();
		//Agora passarei as propriedade para o cliente
		cliente1.id = 1;
		cliente1.nome = "Vanessa Oliveira";
		cliente1.cpf = "505805007.02";
		cliente1.email = "vanessa@uol.com.br";
		cliente1.telefone = "(11) 4002-8922";
		cliente1.dataNascimento = Date.valueOf("2023-03-13") ;
		
		//Irei cadastrar o cliente acima com o comando cadastrar
		System.out.println(cliente1.cadastrar());
	}

}
