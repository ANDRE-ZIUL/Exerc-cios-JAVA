package br.edu.univas;

import java.util.Scanner;

public class ATV05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quest�o 5 da Lista");
		System.out.println("Digite o valor do sal�rio minimo atual: ");
		float salarioMinimo = leia.nextFloat();
		
		System.out.println("Digite seu sal�rio atual: ");
		float salarioIndividuo = leia.nextFloat();
		
		float quantidadeSalarios = salarioIndividuo / salarioMinimo;
		System.out.println("Seu sal�rio � equivalente � " + quantidadeSalarios + " sal�rios m�nimos.");
		leia.close();
	}
}
