
public class Lista{
	protected final static int MAX = 500;
	protected int tamaño;
	protected Compara [] v;

	public Lista(){
		this.tamaño = 0;
		this.v = new Compara [Lista.MAX];
	}
	public boolean incluir (Compara c){
		boolean aux = (this.tamaño < Lista.MAX);
		if (aux) {
			this.v[this.tamaño] = c;
			this.tamaño++;
		}
		return aux;
	}

	public Compara elementoEn (int i){
		Compara c = null;
		if (0 <= i && i < this.tamaño)
			c = this.v[i];
		return c;
	}

	public boolean eliminar (Compara c){
		boolean aux = false;
		// Primero buscamos el elemento
		int i;
		for (i = 0; i < this.tamaño && !aux; i++){
			aux = this.v [i].igualQue (c);
		}
		// Uso el valor de i al salir, muevo todos los elementos uno para atrás
		for (int j = i; j < this.tamaño; j++){
			this.v [j-1] = this.v [j];
		}
		// Si lo hemos encontrado, reducimos en uno la longitud de la lista:
		if (aux) {this.tamaño--;}
		return aux;
	}
	
	public String toString ( ){
		StringBuffer n = new StringBuffer ("\nLa longitud de la lista es " + this.tamaño + ":\n");
		for (int i = 0; i < this.tamaño; i++){
			n.append ("\t El elemento " + this.v [i] + " esta en la lista \n");
		}
		return n.toString();
	}
}
