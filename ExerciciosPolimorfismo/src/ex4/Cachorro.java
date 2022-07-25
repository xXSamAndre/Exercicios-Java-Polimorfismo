package ex4;

public class Cachorro extends Animais{

	public Cachorro(String nome) {
		super(nome);
		
	}

	public void Imprime() {
		System.out.println("O cachorro "+this.getNome());
		movimento();
		System.out.println("em quatro patas");
		falar();
		System.out.println("Au-au");
	}
	
	
}
