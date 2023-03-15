package br.com.poo.estruturaswitch;

import java.util.Scanner;

public class EstruturaSwitch {
	
	public static void main(String[] args) {
		
		String cargo;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um cargo para saber o salário correspondente: ");
		cargo = input.next();
		
		switch(cargo) {
		case "Diretor" :
			System.out.println("\nEsse cargo recebe: 20000");
		break;
		case "Gerente" :
			System.out.println("\nEsse cargo recebe: R$ 15000");
		break;
		case "Secretária":
			System.out.println("\nEsse cargo recebe: R$ 8000");
		break;
		case "Analista" :
			System.out.println("\nEsse cargo recebe: R$ 7000" );
		break;
		case "Assistente" :
			System.out.println("\nEsse cargo recebe: R$ 4000");
		break;
		case "Estagiário":
			System.out.println("\nEsse cargo recebe: R$ 1500");
		break;
		default:
			System.out.println("\nCargo inexistente!");
		break;
		}
	}

}
