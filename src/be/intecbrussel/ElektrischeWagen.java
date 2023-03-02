package be.intecbrussel;

public class ElektrischeWagen extends Car {
    //properties
    private int battery;

    //constructors
    public ElektrischeWagen() {
        this("DEFAULT_ELEKTRISCHEWAGEN_COLOUR_VALUE", 0, 1);
    }

    public ElektrischeWagen(String colour, int speed, int hp) {
        super(colour, speed, hp);
        this.setBattery(100);
    }

    //getters & setters
    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }


    //custom methods
    public void charge(int amount) {

    }


    @Override
    public void accelerator(int amount) {
        //Zorg ervoor dat de acceleratie nu bepaald wordt via de formule (amount + (battery/100)) acceleratie
        //gaat sneller al de batterij meer is opgeladen.
        this.setSpeed(amount + (this.getBattery() / 100));
    }

    @Override
    public String toString() {
        return "Data-type: ElektrischeWagen; Colour: " + this.getColour()
                + "; Speed: " + this.getSpeed()
                + "; hp: " + this.getHp()
                + "; battery%: " + this.getBattery();
    }
}
