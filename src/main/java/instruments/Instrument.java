package instruments;

public abstract class Instrument {

    private String colour;
    private String material;
    private String type;

    public Instrument(String colour, String material, String type) {
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public String colour() {
        return colour;
    }

    public String material() {
        return material;
    }

    public String type() {
        return type;
    }
}
