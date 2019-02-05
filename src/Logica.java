import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import processing.core.PApplet;

public class Logica {

	PApplet p;
	ArrayList<Datos> datos;

	public Logica(PApplet p) {
		this.p = p;

		datos = new ArrayList<Datos>();

		// Cargo el archivo
		String[] archivo = p.loadStrings("data/archivo1.csv");

		for (int i = 1; i < archivo.length; i++) {

			// Separo las palabras por comas
			String[] daticos = archivo[i].split(",");

			System.out.println(daticos[4]);

			datos.add(new Datos(daticos[1], daticos[2], daticos[4]));
		}

	}

	public void pintar() {

		// recorro el arreglo para pintar
		for (int i = 0; i < datos.size(); i++) {

			Datos palabras = datos.get(i);

			int y = 10;

			p.fill(0);
			p.textSize(10);
			p.text(palabras.getNombre(), 50, y + (i * 10));
			p.text(palabras.getCedula(), 250, y + (i * 10));
			p.text(palabras.getPimenton(), 450, y + (i * 10));
		}
	}

	public void comparar() {

		if (p.mouseX > 600 && p.mouseX < 700 && p.mouseY > 0 && p.mouseY < 100) {

			Collections.sort(datos);
		}

		if (p.mouseX > 600 && p.mouseX < 700 && p.mouseY > 100 && p.mouseY < 200) {

			Collections.reverse(datos);
		}
		
		if (p.mouseX > 600 && p.mouseX < 700 && p.mouseY > 200 && p.mouseY < 300) {

			Collections.sort(datos, new Otro());
		}

		if (p.mouseX > 600 && p.mouseX < 700 && p.mouseY > 300 && p.mouseY < 400) {

			Collections.sort(datos, new Otro());
			Collections.reverse(datos);
		}
	}
	
}
