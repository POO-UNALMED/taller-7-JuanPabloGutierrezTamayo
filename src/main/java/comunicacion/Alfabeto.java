package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	public int cantidadLetras() {
		return letras.length;
	}

	@Override
	public String interpretacion() {
		
		return interpretacion;
	}

	@Override
	public String toString() {
		String alfabet="";
		for (int i=0;i<letras.length;i++) {
			if (i==letras.length-1) {
				alfabet= alfabet + letras[i];
			}
			else {
					alfabet= alfabet +letras[i]+", ";
			}
		}
		
		return alfabet;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
