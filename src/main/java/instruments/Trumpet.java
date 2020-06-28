package instruments;

import instruments.Instrument;
import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;

    public Trumpet(String colour, String material, String type, int numberOfValves) {
        super(colour, material, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    public String play(Instrument instrument) {
        return "This instrument sounds like: " + instrument.getSound();
    }
}