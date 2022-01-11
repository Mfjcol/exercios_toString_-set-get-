package exercio2;

public class Funcionario {
	
	private String nome;
	private double salario;
	private double desconto;
	private double taxa;
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto (double desconto) {
		this.desconto = desconto;
	}
	
	public String getNome () {
		return nome;
	}
	
	public  void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getSalario () {
		return salario;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}

	public double getTaxa () {
		return taxa;
	}
	
	public void setTaxa ( double taxa) {

		this.taxa =taxa;
	}
	
	
	
	public double descontoSalario() {

		return salario - desconto;
	}
	
	public double aumentoSalario (){
		
		return salario += ((salario*taxa)/100);
	}
	public String toString () {
		return   " Empregado "
				+ nome
				+", $ "
				+descontoSalario();
	
		
		
	}
}
