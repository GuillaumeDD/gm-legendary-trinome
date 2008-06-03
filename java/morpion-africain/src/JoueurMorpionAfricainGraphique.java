import java.awt.Color;


public class JoueurMorpionAfricainGraphique extends JoueurMorpionAfricain{

	private JoueurPanel panel;
	
	public JoueurMorpionAfricainGraphique(){
		
		super();		
		if(id==0)
			panel = new JoueurPanel(new Color(255,255,0),"Joueur 1");
		else
			panel = new JoueurPanel(new Color(102,255,0),"Joueur 2");
		panel.setJoueur(this);
	}
	
	public void setScore(int score){
		panel.setScore(score);
	}
	
	public void setNom(StringBuffer nom){
		this.modifierNom(nom);
	}
	
}
