package morpion;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import jeu.Joueur;
public class CaseMorpionGraphique extends CaseMorpion{
	private MorpionGraphique morpion;
    JButton boutonGraphique;
    
    public CaseMorpionGraphique(){
    }
    
    public CaseMorpionGraphique(int identifiant, MorpionGraphique m){
        super(identifiant);
        boutonGraphique = new JButton(String.valueOf(getId()));
        boutonGraphique.setBorder(new LineBorder(Color.black,1));
        boutonGraphique.setBackground(Color.WHITE);
        boutonGraphique.setMinimumSize(new Dimension(20,20));
        boutonGraphique.setPreferredSize(new Dimension(30,30));
        boutonGraphique.setVisible(true);
        morpion=m;
        

        
        boutonGraphique.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		
        		morpion.jouer(getId());
        		
        	}
        });
    }
    
    public JButton getButton(){
        return boutonGraphique;
    }
    
    public void resetColor(){
    	boutonGraphique.setBackground(Color.WHITE);
    }
    
    public void setColor(){
    	boutonGraphique.setBackground(getJoueur().getCouleur());
    }
    
	public CaseMorpion getThisCase(){
		return this;
	}
	public void setLibre(boolean lib,Joueur j){
		super.setLibre(lib, j);
		if(getLibre()){
			resetColor();
		}else{
			setColor();
		}
	}
	
	public JoueurMorpionGraphique getJoueur(){
		return (JoueurMorpionGraphique)super.getJoueur();
	}
	public void reset(){
		super.reset();
		resetColor();
	}
}
