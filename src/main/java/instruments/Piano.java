package instruments;

import instruments.Instrument;
import behaviours.IPlay;

public class Piano implements IPlay{

    private int numberOfKeys;

    public Piano(String colour, String material, String type, int numberOfKeys) {
        super(colour, material, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String play(Instrument instrument) {
        return "This instrument sounds like: " + instrument.getSound()
    }

}
