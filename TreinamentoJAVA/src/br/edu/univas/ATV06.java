package br.edu.univas;

import java.util.Scanner;

public class ATV06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quest�o 6 da Lista");
		System.out.println("Digite um n�mero inteiro: ");
		int numero = leia.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		System.out.println("O n�mero digitado foi: " + numero + "\nSeu antecessor �: " + antecessor + "\nSeu sucessor �: " + sucessor);
		
		leia.close();
	}
}
