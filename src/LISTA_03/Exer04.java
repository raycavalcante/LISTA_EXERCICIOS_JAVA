package LISTA_03;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		while(true) {
			
			System.out.println("Digite dois valores de X e Y: ");
			
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			if(n1==0 || n2==0) {
				break;
			}else {
				
				String msg = "";
				
				if(n1>0&&n2>0) {
					msg = "Quadrante Q1";
				}else if(n1<0&&n2>0) {
					msg = "Quadrante Q2";
				}
				else if(n1<0&&n2<0) {
					msg="Quadrante Q3";
				}else {
					msg="Quadrante Q4";
				}
				
				System.out.println(msg);
			}
			
			System.out.println();
			
			
		}

		scan.close();

	}
}
