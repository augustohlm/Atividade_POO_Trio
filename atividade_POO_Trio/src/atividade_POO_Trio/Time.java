package atividade_POO_Trio;

public class Time {
	private int caHora, caMinutos, caSegundos;
	
	public void setHora(int h) {
		if ((h > 0) & (h <= 23)) {
			caHora = h;
		} else caHora = 0;
	}
	public int getHora() {
		return caHora;
	}
	
	public void setMinutos (int m) {
		if ((m > 0)&(m <= 59)) {
			caMinutos = m;
		} else  caMinutos = 0;
	}
	public int getMinutos() {
		return caMinutos;
	}
	
	public void setSegundos(int s) {
		if((s > 0)&(s <= 59)) {
			caSegundos = s;
		} else caSegundos = 0;
	
	}
	public int getSegundos() {
		return caSegundos;
	}
	
	public Time() {
		caHora = 0;
		caMinutos = 0;
		caSegundos = 0;
	}
	
	public Time(int Hora) {
		caHora = Hora;
		caMinutos = 0;
		caSegundos = 0;
	
	}
	public Time(int Hora, int Minutos) {
		 caHora = Hora;
		 caMinutos = Minutos;
		 caSegundos = 0;
		
	}
	public Time(int hora, int Minutos, int Segundos) {
		 caHora = hora;
		 caMinutos = Minutos;
		 caSegundos = Segundos;
		
	}
	
	public String exibe() {
		return caHora + ":" + caMinutos + ":" + caSegundos;
	}
}

