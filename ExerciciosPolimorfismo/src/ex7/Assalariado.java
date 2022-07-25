package ex7;

import java.util.Scanner;

public class Assalariado extends Funcionario{

	private double salario;
	
	public Assalariado() {
		
	}
	
	public Assalariado(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}

	
	public double getSalario(double sal) {
		this.salario = sal;
		return salario;
	}

	public String getDados() {
		String s = super.getDados() + "recebe o salario de R$" + getPagamento(salario);
		return s;
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o salario : ");
		double sal = sc.nextDouble();
		
		getSalario(sal);
	}
	
	
	
	
	
	
}
