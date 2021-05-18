package br.edu.univas;

import java.util.Scanner;

public class ATV05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Questão 5 da Lista");
		System.out.println("Digite o valor do salário minimo atual: ");
		float salarioMinimo = leia.nextFloat();
		
		System.out.println("Digite seu salário atual: ");
		float salarioIndividuo = leia.nextFloat();
		
		float quantidadeSalarios = salarioIndividuo / salarioMinimo;
		System.out.println("Seu salário é equivalente à " + quantidadeSalarios + " salários mínimos.");
		leia.close();
	}
}
