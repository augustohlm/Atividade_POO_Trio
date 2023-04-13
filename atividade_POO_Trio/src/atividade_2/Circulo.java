package atividade_2;

public class Circulo {
	public int X, Y;
	public double raio, area, perimetro;
 
	public void CalcularArea(double raio) {
		 area =  Math.PI*Math.pow(raio, 2);
	}
	
	public void CalculoRaio(double ra) {
		raio = ra;
	}
	
	public void CalcularPerimetro(double raio) {
	  perimetro = 2*Math.PI*raio;	
	}
	
	public void MoveX(int x1) {
		X = X + x1;
	}
	
	public void MoveY(int y1) {
		Y = Y + y1;
	}
	
	public void Aumenta(double r) {
		raio = raio * r;
	}
	
	public String exibe(){
		return "\n Valor de X = " + X
			 + "\n Valor de Y = " + Y
			 + "\n Valor do Raio = " + raio
			 + "\n Valor da Area = " + area
			 + "\n Valor do perimetro = " + perimetro
			 + "\n ";
	}
	
	public Circulo(int xP, int yP, double rP) {
		X = xP;
		Y = yP;
		raio = rP;
	}
	public Circulo() {
		X = 0;
		Y = 0;
		raio = 0;
	}

}

