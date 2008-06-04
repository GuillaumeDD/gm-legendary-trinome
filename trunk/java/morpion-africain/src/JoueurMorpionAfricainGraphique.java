import java.awt.Color;


public class JoueurMorpionAfricainGraphique extends JoueurMorpionAfricain{

	private JoueurPanel panel;
	
	public JoueurMorpionAfricainGraphique(){
		super();
	}
	
	public JoueurMorpionAfricainGraphique(int i){
		
		super(i);		
		if(id==0)
			panel = new JoueurPanel(new Color(255,255,0),this);
		else
			panel = new JoueurPanel(new Color(102,255,0),this);
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
}
