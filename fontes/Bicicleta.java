
public class Bicicleta {

	String cor;
	int marcha;
	double valor;

	// M�TODOS
	// M�TODO CONSTRUTOR 1
	public Bicicleta(String cor, int marcha, double valor) {
		this.cor = cor;
		this.marcha = marcha;
		this.valor = valor;
	}// M�TODO CONSTRUTOR 1

	// M�TODO CONSTRUTOR 2
	public Bicicleta(String cor) {
		this.cor = cor;

	}// M�TODO CONSTRUTOR 2

	
	
	
	// RETONAR DADOS
	public String retornarDados() {
		String aux = "";

		aux = "Marcha -> " + marcha + "\n";
		aux += "Valor -> " + valor + "\n";
		aux += "Cor -> " + cor + "\n";

		return aux;
	}// RETONAR DADOS

}// BIKE
