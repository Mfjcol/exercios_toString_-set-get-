package exercio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		
		System.out.println("Digite o nome do alumno e as 3 notas");
		alumno.setNome(sc.nextLine());
		alumno.setPrimeiraNota(sc.nextDouble());
		alumno.setSegundaNota(sc.nextDouble());
		alumno.setTerceiraNota(sc.nextDouble());
		
		System.out.println(alumno);
		
		alumno.notaFinal();
		
		sc.close();

	}

}
