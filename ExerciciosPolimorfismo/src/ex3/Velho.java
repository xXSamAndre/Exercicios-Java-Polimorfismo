package ex3;

public class Velho extends Comprar{

	public Velho(double preco, String cidade) {
		super(preco, cidade);
		
	}
	
	public double comprarVelho() {
		return this.getPreco() * 8.8;
	}
	
    public void Imprime() {
    	super.Imprime();
    	System.out.println("O valor da compra de uma casa velha é: R$ "+comprarVelho());
    }
	
}
