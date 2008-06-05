package morpionAfricain;

public class Main {
  public static void main(String args[]){
	  //MorpionAfricainGraphique m = new MorpionAfricainGraphique();
	  MorpionAfricainConsole m = new MorpionAfricainConsole();
	  boolean b=true;
	  do{
		  m.initialiser();
		  m.jouer();
		  m.reset();
	  }while(b);
  }
}
