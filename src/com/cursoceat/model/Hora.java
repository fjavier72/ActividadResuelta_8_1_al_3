package com.cursoceat.model;

public class Hora {

	protected int hora, minutos;

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
		if (this.minutos == 59) {
			this.minutos = 0;
			if (this.hora == 23)
				this.hora = 0;
			else 
				this.hora++;
		} else 
			this.minutos++;
	}
	
	@Override
	public String toString() {
		return this.hora + ":" + this.minutos;
	}
}
