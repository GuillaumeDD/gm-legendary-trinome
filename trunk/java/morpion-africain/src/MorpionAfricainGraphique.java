/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyho
 */

public class MorpionAfricainGraphique extends MorpionAfricain{
    
    FenetreMorpionAfricain fenetre;
    

    
    public MorpionAfricainGraphique(){
        super();
		joueurCourant=new JoueurMorpionAfricainGraphique();
		joueurs[0]=new JoueurMorpionAfricainGraphique();
		joueurs[1]=new JoueurMorpionAfricainGraphique();
        damier=new DamierMorpionAfricainGraphique();
        fenetre=new FenetreMorpionAfricain((DamierMorpionAfricainGraphique)damier,joueurs);
        System.out.println("Test");
        
    }
 
}
