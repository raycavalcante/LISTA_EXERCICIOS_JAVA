package LISTA_02;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("quantidade em minutos: ");
		int m = scan.nextInt();
		
		double pagar = 50;
		
		if(m>50) {
			int resto =  m - 100;
			
			pagar += resto * 2;
		}
		
		System.out.println("Pagar: "+pagar);
		
		scan.close();

	}

}
