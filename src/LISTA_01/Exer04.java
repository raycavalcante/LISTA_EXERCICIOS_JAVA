package LISTA_01;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = scan.nextInt();
		
		System.out.print("y: ");
		int y = scan.nextInt();
		
		int soma = y+x;
		
		System.out.println("Soma: "+soma);
		scan.close();
	}

}
