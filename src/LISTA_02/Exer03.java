package LISTA_02;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1º valor: ");
		int n = scan.nextInt();
		
		System.out.print("2º valor: ");
		int n2 = scan.nextInt();
		
		System.out.print("3º valor: ");
		int n3 = scan.nextInt();
		
		int menor = n ;
		
		if(n2<menor) {
			menor = n2;
		}
		if(n3<menor) {
			menor = n3;
		}
		
		System.out.println("MENOR: "+menor);

		scan.close();

	}
}
