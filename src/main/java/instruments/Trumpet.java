package instruments;

import behaviours.IPlay;

public class Trumpet implements IPlay {

    private int numberOfValves;

    public Trumpet(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    public String play(Instrument instrument) {
        return "This instrument sounds like: " + instrument.getSound();
    }
}