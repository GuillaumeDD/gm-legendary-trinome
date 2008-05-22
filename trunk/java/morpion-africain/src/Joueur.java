
public abstract class Joueur extends Personne{

	Joueur joueurPrecedent;
	Joueur joueurSuivant;
	
	public abstract void setJoueurPrecedent(Joueur j);
	public abstract void setJoueurSuivant(Joueur j);
	public abstract Joueur getJoueurSuivant();
	public abstract Joueur getJoueurPrecedent();
	public abstract void jouer();
	public abstract void initialiser();
}
