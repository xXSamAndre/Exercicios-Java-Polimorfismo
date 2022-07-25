package ex4;

public class Gato extends Animais{

	public Gato(String nome) {
		super(nome);
		
	}

	public void Imprime() {
		System.out.println("O gato "+this.getNome());
		movimento();
		System.out.println("Em quatro patas");
		falar();
		System.out.println("Miau");
	}
	
	
}
