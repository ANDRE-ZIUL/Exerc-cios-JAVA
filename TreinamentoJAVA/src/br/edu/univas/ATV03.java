package br.edu.univas;

import java.util.Scanner;

public class ATV03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Questão 3 da Lista");
		System.out.println("Informe seu saldo: ");
		float saldo = leia.nextFloat();
	
		float reajuste = (saldo / 100f) + saldo;
		
		System.out.println("Seu saldo com reajuste de 1% é: " + reajuste);
		
		leia.close();		
	}
}
