package morpionAfricain;

public class MainMorpionAfricainConsole {
  public static void main(String args[]){
	  MorpionAfricainConsole m = new MorpionAfricainConsole();
	  boolean b=true;
	  do{
		  m.initialiser();
		  m.jouer();
		  m.reset();
	  }while(b);
  }
}
