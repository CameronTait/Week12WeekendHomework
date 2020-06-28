package instruments;

import behaviours.IPlay;

public class Piano implements IPlay{

    private int numberOfKeys;

    public Piano(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String play(Instrument instrument) {
        return "This instrument sounds like: " + instrument.getSound()
    }

}
