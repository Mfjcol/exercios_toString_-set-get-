package exercio1;

import java.util.Scanner;

import exercio1.Triangulo;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		
		System.out.println("Digite os lados e a base do trinagulo");
		triangulo.setladoB(sc.nextDouble());
		triangulo.setladoB(sc.nextDouble());
		triangulo.setbase(sc.nextDouble());
		
		System.out.println(triangulo);
		
		}

}
