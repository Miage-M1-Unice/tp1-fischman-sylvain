package miage.tp1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File(".");
        Exercice1 ex1 = new Exercice1(f);

        ex1.afficheListe1();
        ex1.afficheListe2();
        ex1.afficheListeFiltre();

        System.out.println("Parcours en profondeur");
        ex1.afficheParcoursProfondeur(".");

    }
}
