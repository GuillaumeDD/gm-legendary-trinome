/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyho
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class JoueurPanel extends JPanel{
    private GridBagLayout magrille=new GridBagLayout();
    private GridBagConstraints contraintes=new GridBagConstraints();
    JLabel titre;
    JLabel nom=new JLabel("Nom");
    JTextField champNom;
    JLabel score=new JLabel("Score");
    JLabel scoreEntier=new JLabel("0");
    public JoueurPanel(Color c,String chaine){
        
        titre=new JLabel(chaine);
        champNom=new JTextField(chaine);
        
        setBackground(c);
        setBorder(new LineBorder(Color.black,1));
        setPreferredSize(new Dimension(100,100));
        
        addConstraints(0,0,4,1,1.0,0.20,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        this.add(titre);
        magrille.setConstraints(titre, contraintes);
        
        addConstraints(0,1,1,1,0.40,0.40,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        this.add(nom);
        magrille.setConstraints(nom, contraintes);
        
        addConstraints(1,1,3,1,0.6,0.40,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        this.add(champNom);
        magrille.setConstraints(champNom, contraintes);
        
        addConstraints(0,2,4,1,1.0,0.20,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        this.add(score);
        magrille.setConstraints(score, contraintes);
        
        addConstraints(0,3,4,1,1.0,0.20,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        this.add(scoreEntier);
        magrille.setConstraints(scoreEntier, contraintes);        
        
        this.setLayout(magrille);
    }
    
    public void addConstraints(int gridx,int gridy, int gridwith,int gridheight,double weightx,double weighty, int fill, int anchor){
        contraintes.gridx=gridx;
        contraintes.gridy=gridy;
        contraintes.gridwidth=gridwith;
        contraintes.gridheight=gridheight;
        contraintes.weightx=weightx;
        contraintes.weighty=weighty;
        contraintes.fill=fill;
        contraintes.anchor=anchor;
    }  
}
