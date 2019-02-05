import processing.core.PApplet;

public class Main extends PApplet{

	Logica log;

	public static void main(String[] args) {
		PApplet.main("Main");
	}
	
	public void setup() {
		log = new Logica(this);
	}
	
	public void settings() {
		size(700,700);
	}
	
	public void draw() {
		background(255);
		log.pintar();
	}
	
	public void mousePressed() {
		log.comparar();
	}
}
