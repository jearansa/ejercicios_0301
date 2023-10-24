
public class ListaOrdenada extends Lista{

	public ListaOrdenada ( ){
		super( );
	}

	public boolean incluir (Compara c){
        boolean aux = (this.tamaño < Lista.MAX);
		if (aux) {
			int i = 0;
			while ((i < this.tamaño) && (c.mayorQue(this.v [i]) || c.igualQue(this.v[i]))){
				i++;
			}
			for (int j = this.tamaño; j > i ; j--) {
				this.v [j]  = this.v [j - 1];
			}
			this.v[i] = c;
			this.tamaño++;
		}
		return aux;
	}
}