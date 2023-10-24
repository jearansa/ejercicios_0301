
public class DoubleCompara extends Compara {

	public Double dato;

	public DoubleCompara (double d){
		super();
		this.dato = Double.valueOf (d);
	}
	public boolean mayorQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof DoubleCompara){
			DoubleCompara ic = (DoubleCompara) i1;
			aux = (this.dato > ic.dato);
		}
		return aux;
	}
	public boolean menorQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof DoubleCompara){
			DoubleCompara ic = (DoubleCompara) i1;
			aux = (this.dato < ic.dato);
		}
		return aux;
	}
	public boolean igualQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof DoubleCompara){
			DoubleCompara ic = (DoubleCompara) i1;
			aux = (this.dato.equals( ic.dato ));
		}
		return aux;
	}
	public String toString(){
		return this.dato.toString();
	}
}