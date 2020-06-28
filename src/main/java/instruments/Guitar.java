package instruments;

import behaviours.IPlay;

public class Guitar implements IPlay {

    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play(Instrument instrument) {
        return "This instrument sounds like: " + instrument.getSound();
    }
}
