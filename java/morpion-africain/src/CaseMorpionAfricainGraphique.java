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
        				if(morpion.getJoueurCourant().estUneCaseOccupee(getThisCase())){
        					morpion.tamponNumCase=getId();
        					morpion.setaChoisiLePion(true);
        				}else{
        					morpion.setaChoisiLePion(false);
        				}
        			}
        			else{
        				morpion.jouer(morpion.tamponNumCase,getId());
        			}
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
