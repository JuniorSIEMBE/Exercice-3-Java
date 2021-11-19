package org.sid;

public class CompteSimple extends Compte{
	
	private int decouvert;

	public CompteSimple(double solde, int decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteSimple [code= "+super.getCode()+", solde= "+super.getSolde()+", decouvert=" + decouvert + "]";
	}
	
	@Override
	public void retirer(double mt) {
		if(mt<=(super.getSolde()+decouvert)) {
			double newSolde = super.getSolde() - mt;
			super.setSolde(newSolde);
		}else {
			throw new RuntimeException("Solde insuffisant!");
		}
	}

}
