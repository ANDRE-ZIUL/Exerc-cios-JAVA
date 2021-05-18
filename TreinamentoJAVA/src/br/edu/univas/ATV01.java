package br.edu.univas;

import java.util.Scanner;

public class ATV01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Questão 1 da Lista");
		System.out.println("Digite seus anos de vida: ");
		int anos = leia.nextInt();
		System.out.println("Digite seus meses de vida: ");
		int meses = leia.nextInt();
		System.out.println("Digite seus dias de vida: ");
		int dias = leia.nextInt();
		
		int diasAnos = anos * 365;
		int diasMeses = meses * 30;
		int diasTotais = diasAnos + diasMeses + dias;
		
		System.out.println(anos + " anos " + meses + " meses e " + dias + " dias = " + diasTotais);
		
		leia.close();
	}
}
