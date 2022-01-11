package exercio3;

public class Alumno {
	
	private String nome;
	private double primeiraNota;
	private double segundaNota;
	private double terceiraNota;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getPrimeiraNota() {
		return primeiraNota;
	}
	
	public void setPrimeiraNota(double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}
	
	public double getSegundaNota() {
		return segundaNota;
	}
	
	public void setSegundaNota(double segundaNota) {
		this.segundaNota = segundaNota;
	}
	
	public double getTerceiraNota () {
		return terceiraNota;
	}
	
	public void setTerceiraNota(Double terceiraNota) {
		this.terceiraNota = terceiraNota;
	}
	
	public void  notaFinal() {
		double notaFinal = (getPrimeiraNota() + getSegundaNota()+ getTerceiraNota()/3);
		
		if ((notaFinal) > 60) {
			System.out.printf("Sua nota e : %.2f e voce passo ", notaFinal );
		}else {
			System.out.printf("Sua nota e : %.2f para passar voce precisa de %.2f", notaFinal,notaFinal -60);
			
		}
		   
		
	}
	
	public String toString() {
		return    nome 
				+", " 
				+ String.format("%.2f", primeiraNota) 
				+" "
				+ segundaNota
				+ " "
				+ terceiraNota;

		
	}
	

	
}
