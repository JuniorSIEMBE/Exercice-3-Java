package org.sid;

public class ComptePayant extends Compte{
	
	private final double taux = 0.05;

	public ComptePayant(double solde) {
		super(solde);
	}

	@Override
	public String toString() {
		return "ComptePayant [code= "+super.getCode()+", solde= "+super.getSolde()+"]";
	}
	
	@Override
	public void verser(double mt) {
		double frais = mt * taux;
		double nouveauMontant = mt - frais;
		super.verser(nouveauMontant);
	}
	
	@Override
	public void retirer(double mt) {
		double frais = mt * taux;
		double nouveauMontant = mt + frais;
		super.retirer(nouveauMontant);
	}

}
