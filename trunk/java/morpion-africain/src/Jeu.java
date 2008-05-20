
public abstract class Jeu {
	Joueur joueurs;
	int nombreDeJoueurs;
	Joueur joueurCourant;
	
	public abstract void creerCases();
	public abstract void creerJoueurs();
	public abstract void initialiser();
	public abstract void jouer();
	public abstract boolean fini();
	public abstract void changerJoueurCourant();
}
