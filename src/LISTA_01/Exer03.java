package LISTA_01;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa: ");
		
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Idade: ");
		int idade = scan.nextInt();
		
		System.out.println("dados da segunda pessoa: ");
		
		scan.nextLine();
		
		System.out.print("Nome: ");
		String nome2 = scan.nextLine();
		
		System.out.print("Idade: ");
		int idade2 = scan.nextInt();
		
		double media = (double) (idade+idade2) / 2;
		
		System.out.printf("A idade media entre "+nome+" e "+nome2+" é de %.1f anos",media);
		
		
		scan.close();
	}

}
