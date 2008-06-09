package morpion;

public class MainMorpionConsole {
  public static void main(String args[]){
	  MorpionConsole m = new MorpionConsole();
	  boolean b=true;
	  do{
		  m.jouer();
		  m.reset();
	  }while(b);
  }
}
