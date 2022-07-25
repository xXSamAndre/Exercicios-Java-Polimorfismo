package ex4;

public class Passaro extends Animais{

	public Passaro(String nome) {
		super(nome);
		
	}

	
	public void Imprime() {
		System.out.println("O passaro "+this.getNome());
		movimento();
		System.out.println("Voando");
		falar();
		System.out.println("piu-piu");
	}
	
}
