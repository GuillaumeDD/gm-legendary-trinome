
public class DamierMorpionAfricain {
	CaseMorpionAfricain cases[] = new CaseMorpionAfricain[9];
	
	public DamierMorpionAfricain(){
            // on cree les cases
            for(int i=0;i<9;i++){
            	cases[i]=new CaseMorpionAfricain(i);
            	cases[i].setLibre(true,null);
            }
            creerAdjacence();
	}
	
        public void creerAdjacence(){
            int casesId[];
		
            // on cree les adjacences
            /*
            * #############
            * # 0 # 1 # 2 #
            * #############
            * # 3 # 4 # 5 #
            * #############
            * # 6 # 7 # 8 #
            * #############	 
            */
            casesId=new int[3];		
            // Case 0
            casesId[0]=1;
            casesId[1]=3;
            casesId[2]=4;
            ajouterAdjacents(0,casesId);
		
            // Case 2
            casesId[0]=1;
            casesId[1]=4;
            casesId[2]=5;
            ajouterAdjacents(2,casesId);
            
            // Case 6
            casesId[0]=3;
            casesId[1]=4;
            casesId[2]=7;
            ajouterAdjacents(6,casesId);
		
            // Case 8
            casesId[0]=4;
            casesId[1]=5;
            casesId[2]=7;
            ajouterAdjacents(8,casesId);
            
            casesId=new int[5];
		
            // Case 1
            casesId[0]=0;
            casesId[1]=2;
            casesId[2]=3;
            casesId[3]=4;
            casesId[4]=5;	
            ajouterAdjacents(1,casesId);
            
            // Case 3
            casesId[0]=0;
            casesId[1]=1;
            casesId[2]=4;
            casesId[3]=7;
            casesId[4]=6;	
            ajouterAdjacents(3,casesId);
            
            // Case 5
            casesId[0]=1;
            casesId[1]=2;
            casesId[2]=4;
            casesId[3]=7;
            casesId[4]=8;	
            ajouterAdjacents(5,casesId);
            
            // Case 7
            casesId[0]=3;
            casesId[1]=4;
            casesId[2]=5;
            casesId[3]=6;
            casesId[4]=8;	
            ajouterAdjacents(7,casesId);
		
            // Case 4
            casesId=new int[8];
            casesId[0]=0;
            casesId[1]=1;
            casesId[2]=2;
            casesId[3]=3;
            casesId[4]=5;
            casesId[5]=6;
            casesId[6]=7;
            casesId[7]=8;
            ajouterAdjacents(4,casesId);
        }
        
        public CaseMorpionAfricain getCase(int id){
		return cases[id];
	}
	
	public void ajouterAdjacents(int caseId,int tab[]){
		int i;
		for(i=0;i<tab.length;i++){
			cases[caseId].ajouterAdjacent(cases[tab[i]]);
		}
	}
	
	public String toString(){
		StringBuffer affichage=new StringBuffer();
		int j;
		affichage.append("#######");
		affichage.append("\n");
		for(j=0;j<9;j++){
			affichage.append("#");
			affichage.append(cases[j]);
			if(j%3==2){
				affichage.append("#");
				affichage.append("\n");
				affichage.append("#######");
				affichage.append("\n");
			}
		}				
		return affichage.toString();
	}
	
	public void reinitialiser(){
		for(int i=0;i<9;i++){
			cases[i].setJoueur(null);
			cases[i].setLibre(true,null);
		}
	}
}
