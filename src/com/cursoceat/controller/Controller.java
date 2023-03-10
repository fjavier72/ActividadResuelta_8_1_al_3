package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.Hora;

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
			
		teclado.close();
	}

}
