package com.template.demo.concepts;

abstract class Click {
	
	 void click(String xpath) {
		  //driver.findElement(xpaht).click();
	 };
	 
}

 interface ColorFilters {
	 void applyColors( );
 }

 interface Resizing {
		public void zoomIn() ;
		public void zoomOut() ;
 }
 
 
public class Grafica extends Click {

	private String tipo = "BARRAS/ PAY/ PUNTOS";
	private int numero_de_secciones = 456465;
	public String color = "NEGRO";
	protected String titulo_de_la_grafica = "por default";
	public String resultado_proceso = "NO_EXECUTED"; // no ejecutado
	
	
	public void pintar_en_pantall_la_grafica(String tipo) {
		if( tipo != null ) {
			// 
			//  algoritmo / procesos para hacer grafica >>> 
			//   que tipo de grafica?
			if(tipo == "PAY") {
					// pay -> dibujar circulo
				if(tipo == "BARRAS") {
					// barras -> rectangulos
					if(this.color != null && this.color.equals("NEGRO")) {
						// en este caso hacemos una grafica mas grande
					}
				}
			}
		}
	}
	
	public void setTipo(String tipo) {
		if(tipo != "BARRAS") {
			System.out.println("El tipo de grafica que buscas no existe");
		} else {
			this.tipo = tipo;
		}
	}

		
}


class Barras extends Grafica  implements Resizing {
	
	public void pintar_barras(){
		// procedimiento para pintar cada barra de diff color
	}

	@Override
	public void zoomIn() {
		// TODO Auto-generated method stub
	}

	@Override
	public void zoomOut() {
		// TODO Auto-generated method stub
	}
	
}

class Pay extends Grafica  implements Resizing {
	
	public void pintar_pay(){
		// pinta el pay con separaciones entre rebanadas
	}

	@Override
	public void zoomIn() {
		// TODO Auto-generated method stub
	}

	@Override
	public void zoomOut() {
		// TODO Auto-generated method stub
	}
	
}



//   javac
// java PowerPoint --> manda llamar el metodo main
class PowerPoint {
	
	public void main(String[] args) {
			Grafica grafica = new Grafica();
			
			grafica.color = "NEGRO";
			//grafica.numero_de_secciones = 100;
			grafica.setTipo("PAY_SUBSECCIONES");
			
			assert grafica.color != null : "Se necesita un color por default para procesar la grafica";
			
			grafica.pintar_en_pantall_la_grafica("pay");
			
			assert grafica.resultado_proceso.equals("SUCCESS") : "La grafica en pantalla no fue la esperada";
	}
}

