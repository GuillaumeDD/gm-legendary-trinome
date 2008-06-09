package morpionAfricain;
import java.awt.Color;

public class JoueurMorpionAfricainGraphique extends JoueurMorpionAfricain{

	private JoueurPanel panel;
	Color couleur;
	
	
	public JoueurMorpionAfricainGraphique(){
		super();
	}
	
	public JoueurMorpionAfricainGraphique(int i,Color c){
		super(i);
		couleur=c;
		panel = new JoueurPanel(this);
		panel.setJoueur(this);
	}
	
	public void setPanel(JoueurPanel p){
		panel=p;
	}
	
	public void addScore(){
		super.addScore();
		panel.setScore(getScore());
	}
	
	public void setNom(StringBuffer nom){
		super.setNom(nom.toString());
	}
	
	public Color getCouleur(){
		return couleur;		
	}
}
