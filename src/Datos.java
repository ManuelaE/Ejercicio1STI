
public class Datos implements Comparable<Datos>{
	
	public String nombre;
	public String cedula;
	public String pimenton;
	
	Datos (String nombre, String cedula, String pimenton){
		this.nombre = nombre;
		this.cedula = cedula;
		this.pimenton = pimenton;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getPimenton() {
		return pimenton;
	}

	public void setPimenton(String pimenton) {
		this.pimenton = pimenton;
	}

	@Override
	public int compareTo(Datos datico) {
		// TODO Auto-generated method stub
		
		return Integer.parseInt(datico.getPimenton()) - Integer.parseInt(this.pimenton);
	}
	
	
}
