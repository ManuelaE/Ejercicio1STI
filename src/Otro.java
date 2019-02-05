import java.util.Comparator;

public class Otro implements Comparator<Datos>{

	@Override
	public int compare(Datos dato1, Datos dato2) {
		// TODO Auto-generated method stub
		return Integer.parseInt(dato2.getCedula()) - Integer.parseInt(dato1.getCedula()) ;
	}

}
