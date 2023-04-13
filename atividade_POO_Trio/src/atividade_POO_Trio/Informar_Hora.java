package atividade_POO_Trio;
import java.util.Scanner;

public class Informar_Hora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time t = new Time();
		
	System.out.print("Informe a hora: ");
	t.setHora(sc.nextInt());
	System.out.print("Informe a minutos: ");
	t.setMinutos(sc.nextInt());
	System.out.print("Informe a segundos: ");
	t.setSegundos(sc.nextInt());
	
	
	System.out.println("As horas é: " + t.exibe());
	
	sc.close();
	}
	

}
