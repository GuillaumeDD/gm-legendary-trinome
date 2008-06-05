package morpion;

import javax.swing.*;import jeu.*;
import java.awt.*;
public class DamierMorpionGraphique extends DamierMorpion{
	private MorpionGraphique morpion;
    JPanel terrainDeJeu;
    private GridBagLayout magrille=new GridBagLayout();
    private GridBagConstraints contraintes=new GridBagConstraints();
    
    public DamierMorpionGraphique(MorpionGraphique m){
    	morpion=m;
        // on cree les cases
        for(int i=0;i<9;i++){
            cases[i]=new CaseMorpionGraphique(i,morpion);
            cases[i].setLibre(true,null);
        }
        creerAdjacence();
        terrainDeJeu=new JPanel();
        
        
        for(int i=0;i<9;i++){
            terrainDeJeu.add(((CaseMorpionGraphique)cases[i]).getButton());
        }
        
        addConstraints(0,0,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[0]).getButton(),contraintes);
        
        addConstraints(1,0,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[1]).getButton(),contraintes); 

        addConstraints(2,0,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[2]).getButton(),contraintes);        

        addConstraints(0,1,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[3]).getButton(),contraintes);
        
        addConstraints(1,1,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[4]).getButton(),contraintes); 

        addConstraints(2,1,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[5]).getButton(),contraintes);        

        addConstraints(0,2,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[6]).getButton(),contraintes);
        
        addConstraints(1,2,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[7]).getButton(),contraintes); 

        addConstraints(2,2,1,1,0.333333333,0.333333333,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER);
        magrille.setConstraints(((CaseMorpionGraphique)cases[8]).getButton(),contraintes); 
        
        terrainDeJeu.setLayout(magrille);
        terrainDeJeu.setPreferredSize(new Dimension(100,100));
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
    
    public CaseMorpionGraphique getCase(int i){
    	return (CaseMorpionGraphique)cases[i];
    }
    
    public MorpionGraphique getMorpion(){
    	return morpion;
    }
}
