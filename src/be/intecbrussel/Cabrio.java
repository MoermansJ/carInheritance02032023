package be.intecbrussel;

public class Cabrio extends Car {
    //properties
    private boolean sunRoof = true; //whether the car has a sunroof
    private boolean isSunRoofEnabled; //whether sunroof is deployed


    //constructors
    public Cabrio() {
        this("DEFAULT_CABRIO_COLOUR_VALUE", 0, 1);
    }

    public Cabrio(String colour, int speed, int hp) {
        super(colour, speed, hp);
    }


    //getters & setters
    public boolean hasSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    public boolean getSunRoofEnabled() {
        return isSunRoofEnabled;
    }

    public void setSunRoofEnabled(boolean sunRoofEnabled) {
        isSunRoofEnabled = sunRoofEnabled;
    }


    //custom methods
    public void openRoof() {
        this.setSunRoofEnabled(!this.getSunRoofEnabled());
    }

    @Override
    public String toString() {
        return "Data-type: Cabrio; "
                + super.toString()
                + "; sunroof: " + this.hasSunRoof()
                + "; sunroof enabled: " + this.getSunRoofEnabled();
    }

}
