package org.sid;

public class Compte {
	
	private static int nbCompte;
	
	private int code;
	
	private double solde;

	public Compte(double solde) {
		++nbCompte;
		code = nbCompte;
		this.solde = solde;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [code= "+code+" , solde=" + solde + "]";
	}
	
	public void retirer(double mt) {
		if(mt<=solde) {
			solde -=mt;
		}else {
			throw new RuntimeException("Solde insuffisant!");
		}
	}
	
	public void verser(double mt) {
		solde +=mt;
	}

}
