
public class Main {
  public static void main(String args[]){
	  Morpion m = new Morpion();
	  boolean i=true;
	  while(i){
		  m.initialiser();
		  m.jouer();
		  m.reinitialiser();
	  }
  }
}
