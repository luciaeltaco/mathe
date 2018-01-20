package at.lucia.mathe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KegelTest {

    @Test
    public void whenDurchMesserAndHoeheThenOberflaeche(){

        //Everything is in meters

        double durchmesser = 6d;
        double hoehe = 10d;

        double oberflaeche = Kegel.berechneOberflaeche(durchmesser, hoehe);

        assertThat(oberflaeche).isBetween(126.6d,126.7d);



    }

}