package LISTA_01;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("duracao: ");
		int d = scan.nextInt();
		
		int h = d / 3600;
		int r = d % 3600;
		int m = r/60;
		int s = r%60;
		
		System.out.println(h+":"+m+":"+s);
		
		scan.close();

	}

}
