package morpion;
import java.awt.Color;

public class JoueurMorpionGraphique extends JoueurMorpion{

	private JoueurPanel panel;
	Color couleur;
	
	
	public JoueurMorpionGraphique(){
		super();
	}
	
	public JoueurMorpionGraphique(int i,Color c){
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
		this.modifierNom(nom.toString());
	}
	
	public Color getCouleur(){
		return couleur;		
	}
}
