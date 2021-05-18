package br.edu.univas;

import java.util.Scanner;

public class ATV06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Questão 6 da Lista");
		System.out.println("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		System.out.println("O número digitado foi: " + numero + "\nSeu antecessor é: " + antecessor + "\nSeu sucessor é: " + sucessor);
		
		leia.close();
	}
}
