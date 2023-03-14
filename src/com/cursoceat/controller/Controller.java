package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.Hora;
import com.cursoceat.model.HoraExacta;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int minutosDespues = 61;
		int nuevaHora, nuevosMinutos;
		boolean horaCorrecta, minutosCorrectos;
		
		System.out.println("Construimos el objeto con la hora 11:30");
		Hora hora = new Hora(11, 30);
		
		System.out.println(hora);
		
		System.out.print(minutosDespues + " minutos después... Ahora son las ");
		for (int i = 0; i < minutosDespues; i++)
			hora.inc();
		
		System.out.println(hora);
		
		System.out.println("Vamos a darle a hora y minutos un nuevo valor");
		System.out.print("Introduzca la nueva hora: ");
		nuevaHora = teclado.nextInt();
		horaCorrecta = hora.setHora(nuevaHora);
		System.out.print("Introduzca los nuevos minutos: ");
		nuevosMinutos = teclado.nextInt();
		minutosCorrectos = hora.setMinutos(nuevosMinutos);
		
		if (horaCorrecta && minutosCorrectos)
			System.out.println("La hora se actualizado correctamente.\nAhora son las " + hora);
		else if (!horaCorrecta && minutosCorrectos)
			System.out.println("La hora no es válida. Sólo se han actualizado los minutos.\nAhora son las " + hora);
		else if (horaCorrecta && !minutosCorrectos)
			System.out.println("Los minutos no son válidos. Sólo se ha actualizado la hora.\nAhora son las " + hora);
		else if (!horaCorrecta && !minutosCorrectos)
			System.out.println("La entrada no es válida. La hora no se pudo cambiar.\nSiguen siendo las " + hora);
		
		System.out.println("********************Ejercicio 8.2********************");
		System.out.println("Construimos el objeto con la hora 13:59:59");
		HoraExacta horaExacta = new HoraExacta(13, 59, 59);
		System.out.println("Ahora son las " + horaExacta);
		System.out.println("Incrementamos la hora en un segundo");
		horaExacta.inc();
		System.out.println("Imprimimos la nueva hora");
		System.out.println("Un segundo después son las " + horaExacta);
			
		System.out.println("********************Ejercicio 8.3********************");
		HoraExacta hora1 = new HoraExacta(14, 25, 35);
		HoraExacta hora2 = new HoraExacta(14, 25, 35);
		HoraExacta hora3 = new HoraExacta(12, 35, 27);
		System.out.println("Comparamos hora1 y hora2");
		if (hora1.equals(hora2))
			System.out.println("Es la misma hora");
		else 
			System.out.println("Son horas distintas");
		
		System.out.println("Comparamos hora1 y hora3");
		if (hora1.equals(hora3))
			System.out.println("Es la misma hora");
		else 
			System.out.println("Son horas distintas");
		
		teclado.close();
	}

}
