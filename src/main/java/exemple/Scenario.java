package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    List<Enchainement> enchainements;

    public Scenario(){
        this.enchainements=new ArrayList<>();
    }

   public void  start(Bandeau bandeau){
        for (Enchainement enchainement : enchainements) {
            for( int i=0; i< enchainement.getRepetition(); i++){
                enchainement.getEffet().animate(bandeau);
            }
        }
       return ;
   }
   public void addeffet( Effet effet, int repetition){
        Enchainement enchainement = new Enchainement(effet, this, repetition);
        enchainements.add(enchainement);
   }
}
