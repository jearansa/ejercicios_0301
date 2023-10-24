
public class StringCompara extends Compara {
	// Por comodidad, nos declaramos
	// el atributo "dato" como "public":
	public String dato;

	public StringCompara (String i){
		super ( );
		this.dato = i;
	}

	public boolean mayorQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof StringCompara){
			StringCompara ic = (StringCompara) i1;
			aux = (this.dato.compareTo(ic.dato) > 0);
		}
		return aux;
	}

	public boolean menorQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof StringCompara){
			StringCompara ic = (StringCompara) i1;
			aux = (this.dato.compareTo(ic.dato) < 0);
		}
		return aux;
	}

	public boolean igualQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof StringCompara){
			StringCompara ic = (StringCompara) i1;
			aux = (this.dato.compareTo(ic.dato) == 0);
		}
		return aux;
	}
	// Redefinimos el método "toString(): String"
	// para que muestre del objeto "dato" de forma adecuada
	public String toString(){
		return this.dato.toString();
	}
}