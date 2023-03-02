package be.intecbrussel;

public class ElektrischeWagen extends Car {
    //properties
    private int battery;

    //constructors
    public ElektrischeWagen() {
        this("DEFAULT_ELEKTRISCHEWAGEN_COLOUR_VALUE", 0, 1, 0);
    }

    public ElektrischeWagen(String colour, int speed, int hp, int battery) {
        super(colour, speed, hp);
        this.setBattery(battery);
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
        //no details on charge method given
        setBattery(amount);
    }


    @Override
    public void accelerator(int amount) {
        //Zorg ervoor dat de acceleratie nu bepaald wordt via de formule (amount + (battery/100)) acceleratie
        //gaat sneller al de batterij meer is opgeladen.
        int newSpeed = this.getSpeed() + (amount + (this.getBattery() / 100));
        this.setSpeed(newSpeed);
    }

    @Override
    public void slow(int amount) {
        //Slow vertraagt de wagen. dit gebaseerd op dezelfde formule al de versnelling maar dan negatief.
        int newSpeed = this.getSpeed() - (amount + (this.getBattery() / 100));
        this.setSpeed(newSpeed);
    }

    @Override
    public String toString() {
        return "Data-type: ElektrischeWagen; "
                + super.toString()
                + "; battery%: " + this.getBattery();
    }
}
