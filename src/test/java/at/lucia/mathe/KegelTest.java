package at.lucia.mathe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KegelTest {

    @Test
    public void whenDurchMesserAndHoeheThenOberflaeche(){
        //Everything is in meters
        double oberflaeche = Kegel.berechneOberflaeche(6d, 10d);
        assertThat(oberflaeche).isBetween(126.6d,126.7d);
    }

}