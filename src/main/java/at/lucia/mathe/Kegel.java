package at.lucia.mathe;

public class Kegel {

    public static double berechneOberflaeche(double durchmesser, double hoehe) {

        double radius = durchmesser / 2;
        double a2 = radius * radius;
        double b2 = hoehe * hoehe;
        double a2PlusB2 = a2 + b2;
        double g = Math.sqrt(a2PlusB2);

        double mantel = Math.PI * radius * g;
        double grundflaeche = a2 * Math.PI;
        double alles = mantel + grundflaeche;

        return alles;
    }
}
