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
public class FenetreMorpionAfricain extends JFrame{
    
    DamierMorpionAfricainGraphique damier;
    Joueur joueurs[];
    JLabel titre=new JLabel("Morpion africain");
    JLabel infos=new JLabel("Joueur 1 commence");
    JPanel conteneur=new JPanel();
    JPanel j1;
    JPanel j2;
    
    private GridBagLayout magrille=new GridBagLayout();
    private GridBagConstraints contraintes=new GridBagConstraints();
    
    public FenetreMorpionAfricain(DamierMorpionAfricainGraphique d,Joueur j[]){
        super("Morpion africain");
        damier=d;
        joueurs=j;
        j1=new JoueurPanel(new Color(255,255,0),(JoueurMorpionAfricainGraphique)j[0]);
        j2=new JoueurPanel(new Color(102,255,0),(JoueurMorpionAfricainGraphique)j[1]);
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
        conteneur.add(damier.getTerrainDeJeu());
        magrille.setConstraints(damier.getTerrainDeJeu(), contraintes);
        
        addConstraints(3,1,1,1,0.25,0.50,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        conteneur.add(j2);
        magrille.setConstraints(j2, contraintes);

        addConstraints(0,2,4,1,1.0,0.25,GridBagConstraints.NONE,GridBagConstraints.CENTER);
        conteneur.add(infos);   
        magrille.setConstraints(infos, contraintes);
        
        conteneur.setLayout(magrille);
        
        this.setContentPane(conteneur);
        this.setVisible(true);
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
    
}
