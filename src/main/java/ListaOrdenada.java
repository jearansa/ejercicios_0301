
public class ListaOrdenada extends Lista{

	public ListaOrdenada ( ){
		super( );
	}

	public boolean incluir (Compara c){
        boolean aux = (this.tama�o < Lista.MAX);
		if (aux) {
			int i = 0;
			while ((i < this.tama�o) && (c.mayorQue(this.v [i]) || c.igualQue(this.v[i]))){
				i++;
			}
			for (int j = this.tama�o; j > i ; j--) {
				this.v [j]  = this.v [j - 1];
			}
			this.v[i] = c;
			this.tama�o++;
		}
		return aux;
	}
}