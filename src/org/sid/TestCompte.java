package org.sid;

public class TestCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//D�claration des comptes
		Compte c1;
		CompteSimple c2; 
		CompteEpargne c3;
		ComptePayant c4;
		//Instanciation des comptes
		c1 = new Compte(1000);
		System.out.println("C1"+c1.toString());
		
		c2 = new CompteSimple(500, 100);
		System.out.println("C2"+c2.toString());
		
		c3 = new CompteEpargne(100, 10);
		System.out.println("C3"+c3.toString());
		
		c4 = new ComptePayant(50);
		System.out.println("C4"+c4.toString());
		
		//Op�rations sur les comptes
		System.out.println("Retrait de 500");
		c1.retirer(500);
		System.out.println("C1"+c1.toString());
		System.out.println("D�pot de 2000");
		c1.verser(2000);
		System.out.println("C1"+c1.toString());
		System.out.println("Retrait de 600");
		c2.retirer(600);
		System.out.println("C2"+c2.toString());
		System.out.println("D�pot de 1000");
		c2.verser(1000);
		System.out.println("C2"+c2.toString());
		System.out.println("application du taux d'inter�t!");
		c3.calculInteret();
		System.out.println("C3"+c3.toString());
		c4.retirer(20);
		System.out.println(c4.toString());
		c4.verser(100);
		System.out.println(c4.toString());
	}
}
