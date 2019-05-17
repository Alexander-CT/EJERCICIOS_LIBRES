package Pack1;

public class Azar {
	int numero;

	public int getNumero() {
		numero = (int) (Math.random() * 2) + 1;
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
