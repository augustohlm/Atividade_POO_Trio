package atividade_2;
import java.util.Scanner;

public class CalculoCirculo {

	public static void main(String[] args) {
		int X, Y;
		double raio;
	int op;	
		Scanner sc = new Scanner(System.in);
		Circulo ci = new Circulo();
		
		
	// Solicitando validação de teste das classes.	
		System.out.print("Informe a coordenada X: ");
		X = sc.nextInt();
		System.out.print("Informe a coordenada Y: ");
		Y = sc.nextInt();
		System.out.print("Informe a coordenada raio: ");
		raio = sc.nextDouble();
		
	ci.X = X;
	ci.Y = Y;
	ci.raio = raio;
	
	ci.CalcularPerimetro(raio);
	ci.CalcularArea(raio);
	
	//VALIDAÇÃO TESTE = OK!!!
 do {
	System.out.println(" - - - - -  MENU  - - - - - ");
	System.out.println("- - - -  1 MOVER  - - - - - ");
	System.out.println(" - - - - 2 AUMENTAR - - - - ");
	System.out.println(" - - - - 3 IMPRIMIR - - - - ");
	System.out.println(" - - - - 4 SAIR     - - - - ");
	System.out.print("Opção: ");
	op = sc.nextInt();
	
	switch(op) {
	
		case 1: 
			System.out.print("Informe o quanto moverá X: ");
			X = sc.nextInt();
			ci.MoveX(X);
			System.out.print("Informe o quanto moverá Y: ");
			Y = sc.nextInt();	
			ci.MoveY(Y);
			break;
			
		case 2:
			System.out.print("Informe a quantidade que o raio será aumentado: ");
			raio = sc.nextDouble();
			ci.Aumenta(raio);
			ci.CalcularPerimetro(raio);
			ci.CalcularArea(raio);
			break;
		case 3: 
			System.out.print(ci.exibe());
			break;
		
		default:
			if(op > 4)
			System.out.println("Informe a opção correta");
		break;
			
	} 	
	
}while(op != 4);
 sc.close();
	}
}
