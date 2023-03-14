package com.cursoceat.model;

public class HoraExacta extends Hora {

	protected int segundos;

	public HoraExacta() {
	}

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if (!setSegundos(segundos))
			System.out.println("Los segundos dados no son correctos.\nSe aplicará el valor 0 por defecto");
	}

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {
		boolean correcto;
		
		if (segundos < 0 || segundos > 59)
			correcto = false;
		else {
			this.segundos = segundos;
			correcto = true;
		}
		
		return correcto;
	}
	
	@Override
	public void inc() {
		if (this.segundos == 59) {
			this.segundos = 0;
			super.inc();
		} else 
			this.segundos++;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean iguales;
		// Creamos un nuevo reloj para hacer la comparación
		HoraExacta otroReloj = (HoraExacta) o;
		
		// Comparamos
		if (this.toString().equals(otroReloj.toString()))
			iguales = true;
		else 
			iguales = false;
		
		return iguales;
	}
	
	@Override
	public String toString() {
		return super.toString() + ":" + this.segundos;
	}
	
}
