package ex2;

public class Cliente {

	private String pais;
	private String dataCadastro;
	
	public Cliente(String pais, String dataCadastro) {
		this.pais = pais;
		this.dataCadastro = dataCadastro;
	}
	
	
	public void Imprime() {
		System.out.println("Pa�s:  "+ this.pais+ ", Data de cadastro:  "+this.dataCadastro);
	}
}
