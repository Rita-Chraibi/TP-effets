package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet {
    int taille = 15;

    public Zoom(int taille) {
        this.taille = taille;
    }
    public Zoom(){

    }

    public void animate(Bandeau bandeau) {

        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
    }
}
