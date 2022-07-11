package ex2;

public class Cliente {

	private String pais;
	private String dataCadastro;
	
	public Cliente(String pais, String dataCadastro) {
		this.pais = pais;
		this.dataCadastro = dataCadastro;
	}
	
	
	public void Imprime() {
		System.out.println("País:  "+ this.pais+ ", Data de cadastro:  "+this.dataCadastro);
	}
}
