package org.sid;

public class CompteEpargne extends Compte {
	
	private int tauxInteret;
	
	public CompteEpargne(double solde, int taux) {
		super(solde);
		tauxInteret = taux;
	}

	public int getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(int tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	@Override
	public String toString() {
		return "CompteEpargne [code= "+super.getCode()+", solde= "+super.getSolde()+", tauxInteret=" + tauxInteret + "]";
	}
	
	public void calculInteret() {
		double montantInteret =  super.getSolde()*tauxInteret;
		double soldefinal = super.getSolde() + montantInteret;
		super.setSolde(soldefinal);
	}

}
