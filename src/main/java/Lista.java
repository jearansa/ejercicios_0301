
public class Lista{
	protected final static int MAX = 500;
	protected int tama�o;
	protected Compara [] v;

	public Lista(){
		this.tama�o = 0;
		this.v = new Compara [Lista.MAX];
	}
	public boolean incluir (Compara c){
		boolean aux = (this.tama�o < Lista.MAX);
		if (aux) {
			this.v[this.tama�o] = c;
			this.tama�o++;
		}
		return aux;
	}

	public Compara elementoEn (int i){
		Compara c = null;
		if (0 <= i && i < this.tama�o)
			c = this.v[i];
		return c;
	}

	public boolean eliminar (Compara c){
		boolean aux = false;
		// Primero buscamos el elemento
		int i;
		for (i = 0; i < this.tama�o && !aux; i++){
			aux = this.v [i].igualQue (c);
		}
		// Uso el valor de i al salir, muevo todos los elementos uno para atr�s
		for (int j = i; j < this.tama�o; j++){
			this.v [j-1] = this.v [j];
		}
		// Si lo hemos encontrado, reducimos en uno la longitud de la lista:
		if (aux) {this.tama�o--;}
		return aux;
	}
	
	public String toString ( ){
		StringBuffer n = new StringBuffer ("\nLa longitud de la lista es " + this.tama�o + ":\n");
		for (int i = 0; i < this.tama�o; i++){
			n.append ("\t El elemento " + this.v [i] + " esta en la lista \n");
		}
		return n.toString();
	}
}
