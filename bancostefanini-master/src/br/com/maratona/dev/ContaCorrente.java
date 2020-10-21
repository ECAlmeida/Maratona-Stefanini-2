package br.com.maratona.dev;

public class ContaCorrente extends Conta implements ContaPrivate,Emprestimo{
	
	private Float  limite;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(Float limite,Integer agencia) {
		super();
		this.limite = limite;
	}
	
	public void setLimite(Float limite) {
		this.limite = limite;
	}
	public Float getLimite() {
		return limite;
	}
	
	@Override
	public void sacar(Double valorSaque) {
		System.out.println("Filho");
		super.sacar(valorSaque);
		//saque com CPMF
	}
	
	@Override
	public void saqueExtra(Float taxa) {
		//1.5
	}
	
	@Override
	public void emprestimo(Float taxa) {
		// TODO Auto-generated method stub
		
	}
	
}
