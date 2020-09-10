package ui;

import java.util.Scanner;

import model.Algortihm;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite el 1er número");
		Scanner sc = new Scanner(System.in);
		String numStr = sc.next();
		int num = Integer.parseInt(numStr);
		System.out.println("Digite el 2do número");
		String num1Str = sc.next();
		int num1 = Integer.parseInt(num1Str);
		
		Algortihm ea = new Algortihm(num, num1);
		
		int mcd = ea.mcd(); 
		
		System.out.println("El mcd("+num+", "+num1+") = "+mcd);
		
		sc.close();
	}

}
