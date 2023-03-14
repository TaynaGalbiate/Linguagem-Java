package br.com.poo.estruturaif;

import java.util.Scanner;

public class EstruturaIf3 {
	 
	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("========== SISTEMA DE NOTAS ==========\n");
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("\nDigite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("\nDigite a terceira nota: ");
		nota3 = entrada.nextDouble();
		
		System.out.println("\nDigite a primeira nota: ");
		nota4 = entrada.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\nA média do aluno é: " + media);
		
		if (media >= 7) {
			System.out.println("\nAPROVADO!");
		}
		else if (media <= 4) {
			System.out.println("\nREPROVADO!");
		}
		else {
			System.out.println("\nRECUPERAÇÃO!");
		}
	}
}
