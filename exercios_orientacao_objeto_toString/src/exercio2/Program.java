package exercio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome o salario e o desconto ");
		
		funcionario.setNome(sc.nextLine());
		funcionario.setSalario(sc.nextDouble());
		funcionario.setDesconto(sc.nextDouble());
		
		System.out.println(funcionario);
		
		System.out.println("Digite o aumento do empregado em %");
		funcionario.setTaxa(sc.nextDouble());
		
		double aux = funcionario.aumentoSalario();
		
		System.out.println("Aumento Salario: "+ funcionario.getNome() + ", $ "+ aux );

	}

}
