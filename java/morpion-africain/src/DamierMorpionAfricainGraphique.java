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
public class DamierMorpionAfricainGraphique extends DamierMorpionAfricain{
    JPanel terrainDeJeu;
    private GridBagLayout magrille=new GridBagLayout();
    private GridBagConstraints contraintes=new GridBagConstraints();
    
    public DamierMorpionAfricainGraphique(){
        // on cree les cases
        for(int i=0;i<9;i++){
            cases[i]=new CaseMorpionAfricainGraphique(i);
            cases[i].setLibre(true,null);
        }
        creerAdjacence();
        
        terrainDeJeu=new JPanel();
        
        
        for(int i=0;i<9;i++){
            terrainDeJeu.add(((CaseMorpionAfricainGraphique)cases[i]).getButton());
        }
        
        addConstraints(0,0,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[0]).getButton(),contraintes);
        
        addConstraints(1,0,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[1]).getButton(),contraintes); 

        addConstraints(2,0,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[2]).getButton(),contraintes);        

        addConstraints(0,1,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[3]).getButton(),contraintes);
        
        addConstraints(1,1,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[4]).getButton(),contraintes); 

        addConstraints(2,1,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[5]).getButton(),contraintes);        

        addConstraints(0,2,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[6]).getButton(),contraintes);
        
        addConstraints(1,2,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[7]).getButton(),contraintes); 

        addConstraints(2,2,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionAfricainGraphique)cases[8]).getButton(),contraintes); 
        
        terrainDeJeu.setLayout(magrille);
        terrainDeJeu.setPreferredSize(new Dimension(150,150));
        terrainDeJeu.setVisible(true);
    }
    
    public JPanel getTerrainDeJeu(){
        return terrainDeJeu;
    }
    
    public void addConstraints(int gridx,int gridy, int gridwith,int gridheight,double weightx,double weighty, int ipadx, int ipady ,int fill, int anchor){
        contraintes.gridx=gridx;
        contraintes.gridy=gridy;
        contraintes.gridwidth=gridwith;
        contraintes.gridheight=gridheight;
        contraintes.weightx=weightx;
        contraintes.weighty=weighty;
        contraintes.ipadx=ipadx;
        contraintes.ipady=ipady;
        contraintes.fill=fill;
        contraintes.anchor=anchor;
    }  
}
