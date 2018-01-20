package at.lucia.mathe;

public class Kegel {

    public static double berechneOberflaeche(double durchmesser, double hoehe) {
        double radius = durchmesser / 2;
        double a2 = radius * radius;
        return Math.PI * radius * Math.sqrt(a2 + hoehe * hoehe) + a2 * Math.PI;
    }
}
