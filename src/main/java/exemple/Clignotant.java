package exemple;

import bandeau.Bandeau;

public class Clignotant extends Effet{

    public void animate(Bandeau bandeau){
        String message = bandeau.getMessage();
        bandeau.sleep(1000);
        bandeau.setMessage(" ");
        bandeau.sleep(1000);
        bandeau.setMessage(message);
    }
}
