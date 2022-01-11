package exercio1;

public class Triangulo {
	
	private   double   ladoA;
	private   double   ladoB;
	private   double   base;
	
	public double getladoA() {
		return ladoA;
	}

	public void setladoA(double ladoA) {
		this.ladoA = ladoA;
	}
	
	public double getladoB() {
		return ladoB;
		
	}
	
	public void setladoB(double ladoB) {
		this.ladoB = ladoB;
		
	}
	
	public double getbase() {
		return base;
	}
	
	public void setbase (double base) {
		this.base = base;
	}

	public double area () {
		return (base*(ladoA+ladoB))/2;
	}
	
	public double perimetro () {
		return (2*(ladoA+ladoB))+base;
	}
	
	public double diagonal () {

		return ((ladoA * ladoA) + (ladoB * ladoB))+base/2;
	}
	
	public String toString() {
		return " A area do triangulo e: "
				+ area()
				+ "\n O perimetro do triangulo e :"
				+ perimetro()
				+"\n A diagonal do triangulo e :"
				+ diagonal();

	}

}
