/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyho
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class CaseMorpionAfricainGraphique extends CaseMorpionAfricain{
	private MorpionAfricainGraphique morpion;
    JButton boutonGraphique;
    
    public CaseMorpionAfricainGraphique(){
    }
    
    public CaseMorpionAfricainGraphique(int identifiant, MorpionAfricainGraphique m){
        super(identifiant);
        boutonGraphique = new JButton(String.valueOf(id));
        boutonGraphique.setBorder(new LineBorder(Color.black,1));
        boutonGraphique.setBackground(Color.WHITE);
        boutonGraphique.setMinimumSize(new Dimension(20,20));
        boutonGraphique.setPreferredSize(new Dimension(30,30));
        boutonGraphique.setVisible(true);
        morpion=m;
        

        
        boutonGraphique.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		
        		if(morpion.getTour()<6){
        			morpion.initialiser(getId());
        		}else{ 
        			if(!morpion.aChoisiLePion()){
        				//si le joueur n'a pas choisi de pion
	        			if(morpion.getJoueurCourant().estUneCaseOccupee(getThisCase())){
	        				//si cette case contient un pion du joueur
	        				morpion.tamponNumCase=getId();
	        				morpion.setaChoisiLePion(true);//alors il a choisi son pion
	        			}else{
	        				//dans le cas contraire il n'a pas choisi son pion
	        				morpion.setaChoisiLePion(false);
	        			}
	        		}else{
	        			//si le joueur a choisi son pion, on joue
	        			morpion.jouer(morpion.tamponNumCase,getId());
	        			// on met le choix du pion à false dans le cas où le pion est "bloqué"
	        			morpion.setaChoisiLePion(false);
	        			//il n'y aura pas d'appel à changerJoueurCourant qui remettra à false
	        		}
        			System.out.println("aChoisiLePion : "+morpion.aChoisiLePion());
        		}
        	}
        });
    }
    
    public JButton getButton(){
        return boutonGraphique;
    }
	
	public void setColor(int numJoueur){
		switch(numJoueur){
		case -1 : boutonGraphique.setBackground(Color.WHITE);break;
		case  0 : boutonGraphique.setBackground(Color.BLUE);break;
		case  1 : boutonGraphique.setBackground(Color.RED);break;
		}   
	}
	
	public CaseMorpionAfricain getThisCase(){
		return this;
	}
}
