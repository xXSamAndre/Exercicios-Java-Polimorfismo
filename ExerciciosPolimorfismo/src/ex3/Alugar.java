package ex3;

public class Alugar extends Imovel{

	public Alugar(double preco, String cidade) {
		super(preco, cidade);
		
	}

	public double precoAluguel() {
		return this.getPreco() + 100;
	}
	
	public void Imprime() {
		super.Imprime();
		System.out.println("Pre�o do aluguel em itaqua �:  "+precoAluguel());
	}
	
	
}
