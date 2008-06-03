
public class Personne {
	private StringBuffer nom;
	
	public Personne(){
	}
	
	public Personne(StringBuffer nomPersonne){
	  nom=new StringBuffer(nomPersonne);			
	}
	
	public StringBuffer getNom(){
		return nom;
	}
	
	public void modifierNom(StringBuffer nouveauNom){
		nom=new StringBuffer(nouveauNom);
	}
}
