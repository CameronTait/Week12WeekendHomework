package instruments;

import instruments.Instrument;
import behaviours.IPlay;

public class Guitar implements IPlay {

    private int numberOfStrings;

    public Guitar(String colour, String material, String type, int numberOfStrings) {
        super(colour, material, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play(Instrument instrument) {
        return "This instrument sounds like: " + instrument.getSound();
    }
}
