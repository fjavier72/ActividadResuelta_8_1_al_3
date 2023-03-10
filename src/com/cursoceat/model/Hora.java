package com.cursoceat.model;

public class Hora {

	private int hora, minutos;

	public Hora() {
	}

	public Hora(int hora, int minutos) {
		if (!setHora(hora))
			System.out.println("La hora dada no es correcta\nSe aplicará el valor 0 por defecto");
		
		if (!setMinutos(minutos))
			System.out.println("Los minutos dados no son correctos\nSe aplicará el valor 0 por defecto");
	}

	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) {
		boolean correcto;
		
		if (hora < 0 || hora > 23)
			correcto = false;
		else {
			this.hora = hora;
			correcto = true;
		}
		
		return correcto;
	}

	public int getMinutos() {
		return minutos;
	}

	public boolean setMinutos(int minutos) {
		boolean correcto;
		
		if (minutos < 0 || minutos > 59)
			correcto = false;
		else {
			this.minutos = minutos;
			correcto = true;
		}
		
		return correcto;
	}
	
	public void inc() {
		if (minutos == 59) {
			minutos = 0;
			if (hora == 23)
				hora = 0;
			else 
				hora++;
		} else 
			minutos++;
	}
	
	@Override
	public String toString() {
		return this.hora + ":" + this.minutos;
	}
}
