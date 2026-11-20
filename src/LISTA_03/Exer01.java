package LISTA_03;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("Digite dois numeros: ");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			if(n1==n2) {
				break;
			}
			else {
				
				String ms = "DECRESCENTE";
				
				if(n1<n2) {
					ms = "CRESCENTE";
				}
				
				System.out.println(ms);
			}
		}

		scan.close();

	}
}
