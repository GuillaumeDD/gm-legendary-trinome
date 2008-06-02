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
        damier=new DamierMorpionAfricainGraphique();
        fenetre=new FenetreMorpionAfricain((DamierMorpionAfricainGraphique)damier,joueurs);
        
        
    }
 
}
