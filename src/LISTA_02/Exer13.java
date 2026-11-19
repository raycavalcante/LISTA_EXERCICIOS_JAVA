package LISTA_02;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("x: ");
		double x = scan.nextDouble();
		
		System.out.print("y: ");
		double y = scan.nextDouble();
		
		String ms = "";
		
		if(x>0 && y>0) {
			ms = "Q1";
		}
		else if(x<0 && y>0) {
			ms = "Q2";
		}
		else if(x<0 && y<0) {
			ms = "Q3";
		}
		else if(x>0 && y<0) {
			ms = "Q4";
		}
		else if(x!=0 && y ==0) {
			ms = "Eixo X";
		}
		else if(x==0 && y!=0) {
			ms = "Eixo Y"; 
		}
		else {
			ms = "Origem";
		}
		
		System.out.println(ms);

		scan.close();

	}
}
