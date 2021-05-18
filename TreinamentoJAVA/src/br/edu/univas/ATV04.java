package br.edu.univas;

import java.util.Scanner;

public class ATV04 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Questão 4 da Lista");
		System.out.println("Digite a porcentagem do IPI a ser acrescida: ");
		float imposto = leia.nextFloat();
		
		System.out.println("Digite o código da 1º peça: ");
		leia.nextInt();
		
		System.out.println("Digite o valor da 1º peça: ");
		float valor1 = leia.nextFloat();
		
		System.out.println("Digite a quantidade de peças: ");
		float qtd1 = leia.nextFloat();
		
		System.out.println("Digite o código da 2º peça: ");
		leia.nextInt();
		
		System.out.println("Digite o valor da 2º peça: ");
		float valor2 = leia.nextFloat();
		
		System.out.println("Digite a quantidade de peças: ");
		float qtd2 = leia.nextFloat();
	
		double valorTotal = (valor1 * qtd1 + valor2 * qtd2) * (imposto / 100 + 1);
		
		System.out.println("O valor total da compra será de: " + valorTotal);
		
		leia.close();
	
	}

}
