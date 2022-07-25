package ex7;

import java.util.Scanner;

public class Horista extends Funcionario{

	private double hora;
	private double valorHora;
	
	public Horista() {
		
	}

	public Horista(String nome, double hora, double valorHora) {
		super(nome);
		this.hora = hora;
		this.valorHora = valorHora;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	public void adicionarHoras(double h) {
		this.hora = h;
	}
	
	public double getPagamento(double vh) {
		return vh * hora;
	}
	
	public String getDados() {
		String s = super.getDados() + "Trabalha  " + hora + " horas, e ganha por  " + valorHora + "Logo, recebe R$" + getPagamento(hora);
		return s;
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o valor das horas: ");
		double vh = sc.nextDouble();
		System.out.println("Quantas horas trabalhadas:  ");
		double h = sc.nextDouble();
		
        setValorHora(vh);
		setHora(h);
		
		
		
	}
	
}
