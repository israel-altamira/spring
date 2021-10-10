package com.template.demo;

import org.springframework.beans.factory.annotation.Required;

public class AppFinanciera {

	public void init() {
		Planeacion quincena1 = new Planeacion();
		quincena1.nombre = "1~Abril";
		quincena1.sueldo = 10480.0;
		quincena1.conceptos = new Concepto[10];

		Concepto c1 = quincena1.conceptos[0] = new Concepto();
		c1.tag = "fijos";
		c1.nombre = "agua";
		c1.total = 195.0;

		Concepto c2 = quincena1.conceptos[1] = new Concepto();
		c2.tag = "fijos";
		c2.nombre = "luz";
		c2.total = 190.0;

		Concepto c3 = quincena1.conceptos[2] = new Concepto();
		c3.tag = "GASTOS";
		c2.nombre = "semanal";
		c3.total = 3000.0;

		// sacar el total por tags
		// fijos -> 9670
		// variables -> 2020
		// semanales -> 3000
		// Mostrar graficas

		Execucion e = new Execucion();
		e.nombre = quincena1.nombre;
		e.gastos[0].nombre = quincena1.conceptos[0].nombre; // agua
		e.gastos[0].tag = quincena1.conceptos[0].tag;
		e.gastos[0].total = 195.0;

		// si el tag es PERIOD-FREE, then el gasto es semanal/libre
		// en la planeacion el tag tiene asigando un monto total de 3mil
		e.gastos[0].tag = quincena1.conceptos[2].tag;
		e.gastos[0].nombre = "abarrotes"; // agua
		e.gastos[0].total = 75.0;
	}

}

class Planeacion {
	double sueldo;
	String nombre;
	Concepto[] conceptos;

	@Required
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

class Concepto {
	String nombre;
	double total;
	String tag;

	// Concepto[] conceptos;
	@Required
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

class Execucion {
	String nombre;
	Concepto[] gastos;
}
