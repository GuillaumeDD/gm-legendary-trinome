/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyho
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class CaseMorpionAfricainGraphique extends CaseMorpionAfricain{
    JButton boutonGraphique;
    public CaseMorpionAfricainGraphique(){
        super();
        boutonGraphique = new JButton(String.valueOf(id));
    }
    
    public CaseMorpionAfricainGraphique(int identifiant){
        super(identifiant);
        boutonGraphique = new JButton(String.valueOf(id));
        boutonGraphique.setBorder(new LineBorder(Color.black,1));
        boutonGraphique.setBackground(Color.WHITE);
        boutonGraphique.setMinimumSize(new Dimension(20,20));
        boutonGraphique.setPreferredSize(new Dimension(30,30));
    }
    
    public JButton getButton(){
        return boutonGraphique;
    }
        
}
