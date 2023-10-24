
public class IntegerCompara extends Compara{
	// Por comodidad, nos declaramos
	// el atributo "dato" como "public":
	public Integer dato;

	public IntegerCompara (int i){
		super();
		this.dato = Integer.valueOf (i);
	}

	public boolean mayorQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof IntegerCompara){
			IntegerCompara ic = (IntegerCompara) i1;
			aux = (this.dato > ic.dato);
		}
		return aux;
	}

	public boolean menorQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof IntegerCompara){
			IntegerCompara ic = (IntegerCompara) i1;
			aux = (this.dato < ic.dato);
		}
		return aux;
	}

	public boolean igualQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof IntegerCompara){
			IntegerCompara ic = (IntegerCompara) i1;
			aux = (this.dato.equals( ic.dato ));
		}
		return aux;
	}
	// Redefinimos el método "toString(): String"
	// para que muestre del objeto "dato" de forma adecuada,
	// añadiendo un salto de línea
	public String toString( ) {
		return this.dato.toString( );
	}
}