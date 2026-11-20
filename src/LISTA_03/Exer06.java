package LISTA_03;

import java.util.Scanner;

public class Exer06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {
			
			System.out.print("Numero inteiro: ");
			int num = scan.nextInt();
			
			if(num==0) {
				break;
			}else {
				if(num%2!=0) {
					num++;
				}
				
				int soma =0;
				
				for(int i =0;i<5;i++) {
					
					soma += num;
					
					num+=2;
				}
				
				System.out.println("Soma = "+soma);
			}
			
			num = 1;
			
		}

		scan.close();

	}
}
