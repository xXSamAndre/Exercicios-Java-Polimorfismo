package ex2;

public class PessoaJuridica extends Cliente{

	private String razaoSocial;
	private String nomeFantasia;
	private String sigla;
	private String CNPJ;
	
	public PessoaJuridica(String pais, String dataCadastro,String razaoSocial, String nomeFantasia, String sigla, String cnpj) {
		super(pais, dataCadastro);
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.sigla = sigla;
		this.CNPJ = CNPJ;
}

	public void Imprime() {
		super.Imprime();
		System.out.println("Razão Social:  "+this.razaoSocial);
		System.out.println("Nome Fantasia:  "+this.nomeFantasia);
		System.out.println("Sigla:  "+this.sigla);
		System.out.println("CNPJ:  "+this.CNPJ);
	}
	
	
}