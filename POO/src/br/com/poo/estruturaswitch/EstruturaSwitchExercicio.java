package br.com.poo.estruturaswitch;

import java.util.Scanner;

public class EstruturaSwitchExercicio {
	
	public static void main(String[] args) {
		
		String cargo;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um cargo para saber o salário correspondente: ");
		cargo = input.next();
		
		switch(cargo.toLowerCase()) {	//toLowerCase converte as letras minúsculas para maiúsculas, então a pessoa pode escrever tanto maiúsculo como minúsculo que não dá erro
		case "diretor" :
			System.out.println("\nEsse cargo recebe: 20000");
		break;
		case "gerente" :
			System.out.println("\nEsse cargo recebe: R$ 15000");
		break;
		case "secretária":
			System.out.println("\nEsse cargo recebe: R$ 8000");
		break;
		case "analista" :
			System.out.println("\nEsse cargo recebe: R$ 7000" );
		break;
		case "assistente" :
			System.out.println("\nEsse cargo recebe: R$ 4000");
		break;
		case "estagiário":
			System.out.println("\nEsse cargo recebe: R$ 1500");
		break;
		default:
			System.out.println("\nCargo inexistente!");
		break;
		}
	}

}
