package org.sid;

public class ComptePayant extends Compte{

	public ComptePayant(double solde) {
		super(solde);
	}

	@Override
	public String toString() {
		return "ComptePayant [code= "+super.getCode()+", solde= "+super.getSolde()+"]";
	}
	
	@Override
	public void verser(double mt) {
		double frais = mt * 0.05;
		double nouveauMontant = mt - frais;
		super.verser(nouveauMontant);
	}
	
	@Override
	public void retirer(double mt) {
		double frais = mt * 0.05;
		double nouveauMontant = mt + frais;
		super.retirer(nouveauMontant);
	}

}
