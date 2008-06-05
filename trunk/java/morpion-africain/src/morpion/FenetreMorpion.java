package morpion;

import javax.swing.*;import jeu.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FenetreMorpion extends JFrame{
    MorpionGraphique jeuCourant;
    JLabel titre=new JLabel("Morpion");
    JLabel infos=new JLabel("Joueur 1 commence");
    JPanel conteneur=new JPanel();
    JButton nouvellePartie=new JButton("Nouvelle partie");
    JPanel j1;
    JPanel j2;
    
    private GridBagLayout magrille=new GridBagLayout();
    private GridBagConstraints contraintes=new GridBagConstraints();
    
    public FenetreMorpion(MorpionGraphique jeu){
    	super("Morpion africain");
    	jeuCourant=jeu;
        //damier=jeuCourant.getDamier();
        j1=new JoueurPanel(jeuCourant.getJoueur(0));
        j2=new JoueurPanel(jeuCourant.getJoueur(1));
        this.setBounds(100,100,450,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        // Affichage des JLabel
        titre.setBackground(Color.CYAN);
        titre.setFont(new Font(titre.getText(), Font.PLAIN, 18));
        infos.setBackground(Color.GREEN);
        
        addConstraints(0,0,4,1,1.0,0.25,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        conteneur.add(titre);
        magrille.setConstraints(titre, contraintes);
        
        addConstraints(0,1,1,1,0.25,0.5,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        conteneur.add(j1);
        magrille.setConstraints(j1, contraintes);

        addConstraints(1,1,2,1,0.5,0.50,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        conteneur.add(jeuCourant.getDamier().getTerrainDeJeu());
        magrille.setConstraints(jeuCourant.getDamier().getTerrainDeJeu(), contraintes);
        
        addConstraints(3,1,1,1,0.25,0.50,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        conteneur.add(j2);
        magrille.setConstraints(j2, contraintes);

        addConstraints(0,2,4,1,1.0,0.25,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        conteneur.add(infos);   
        magrille.setConstraints(infos, contraintes);
        
        addConstraints(0,3,4,1,1.0,0.25,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        conteneur.add(nouvellePartie);   
        magrille.setConstraints(nouvellePartie, contraintes);   
                
        conteneur.setLayout(magrille);
        
        this.setContentPane(conteneur);
        this.setVisible(true);
        
        nouvellePartie.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		reset();
        	}
        });
     
    }
    
    public void addConstraints(int gridx,int gridy, int gridwith,int gridheight,double weightx,double weighty,int fill, int anchor){
        contraintes.gridx=gridx;
        contraintes.gridy=gridy;
        contraintes.gridwidth=gridwith;
        contraintes.gridheight=gridheight;
        contraintes.weightx=weightx;
        contraintes.weighty=weighty;
        contraintes.fill=fill;
        contraintes.anchor=anchor;
    } 
    
    public void setTextInfos(String t){
    	infos.setText(t);
    }
    
    public void reset(){
    	jeuCourant.reset();
	    infos.setText(jeuCourant.getJoueurCourant()+" commence ");
    }
}
