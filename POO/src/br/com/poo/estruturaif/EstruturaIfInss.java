package br.com.poo.estruturaif;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EstruturaIfInss {
	
	//Programa simples para calcular o desconto do INSS, trabalhando com if else e cálculos matemáticos
	
	public static void main(String[] args) {
		double salario;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário:");
		DecimalFormat formatter = new DecimalFormat("############.##");
		 
		salario = entrada.nextDouble();
		
		
		if (salario <= 1302) {
			System.out.println("\nO seu desconto é de R$ " + formatter.format((salario * 7.5)/100));
		}
		else if (salario <= 2571.29) {
			System.out.println("\nO seu desconto é de R$ " + formatter.format((salario * 9)/100));
		}
		else if (salario <= 3856.94) {
			System.out.println("\nO seu desconto é de R$ " + formatter.format((salario * 12)/100));
		}
		
		else if (salario <= 7507.49) {
			System.out.println("\nO seu desconto é de R$ " + formatter.format((salario * 14)/100));
		}
		
		else {
			System.out.println("\nValor indisponível.");
		}
				
	}

}
