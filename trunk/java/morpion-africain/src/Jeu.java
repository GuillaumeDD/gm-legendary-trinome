
public class Jeu {
	Joueur joueurs[];
	int nombreDeJoueurs;
	Joueur joueurCourant;
	
	public Jeu(int nbJoueurs){
		nombreDeJoueurs=nbJoueurs;
		joueurs = new Joueur[nombreDeJoueurs];
		joueurs[0]=new Joueur();
		joueurs[1]=new Joueur();
		//Initialisation des joueurs precedent et suivant pour chaque joueur
		joueurs[0].setJoueurPrecedent(joueurs[nombreDeJoueurs-1]);
		if(nombreDeJoueurs!=0){
			joueurs[0].setJoueurSuivant(joueurs[1]);
			joueurs[nombreDeJoueurs-1].setJoueurPrecedent(joueurs[nombreDeJoueurs-2]);
			joueurs[nombreDeJoueurs-1].setJoueurSuivant(joueurs[0]);
		}
		else
			joueurs[0].setJoueurSuivant(joueurs[0]);
		for(int i=1;i<nombreDeJoueurs-1;i++){
			joueurs[i].setJoueurPrecedent(joueurs[i-1]);
			joueurs[i].setJoueurSuivant(joueurs[i+1]);
		}
		
	}
	
	public void jouer(){
	}
	
	public void changerJoueurCourant(){
	}
}
