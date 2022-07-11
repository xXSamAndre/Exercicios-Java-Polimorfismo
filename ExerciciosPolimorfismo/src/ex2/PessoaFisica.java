package ex2;

public class PessoaFisica extends Cliente{

	private String nome;
	private String sobrenome;
	private String CPF;
	
	
	public PessoaFisica(String pais, String dataCadastro,String nome, String sobrenome,String CPF) {
        super(pais, dataCadastro);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.CPF = CPF;
	}
	
	
	public void Imprime() {
		super.Imprime();
		System.out.println("Nome:  "+ this.nome + this.sobrenome);
		System.out.println("CPF:  "+this.CPF);
	}
	
}
