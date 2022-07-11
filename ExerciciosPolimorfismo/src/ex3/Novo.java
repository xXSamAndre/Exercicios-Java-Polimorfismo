package ex3;

public class Novo extends Comprar{

	public Novo(double preco, String cidade) {
		super(preco, cidade);
		
	}

	public double comprarNovo() {
		return this.getPreco() * 2;
	}
	 
	public void Imprime() {
		super.Imprime();
		System.out.println("O valor de compra de uma casa nova é: R$ "+comprarNovo());
	}
	
	
}
