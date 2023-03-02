package be.intecbrussel;

public class Car {
    //properties
    private String colour;
    private int speed;
    private int hp;


    //constructors
    public Car() {
        this("DEFAULT_COLOUR_VALUE", 0, 1);
    }

    public Car(String colour, int speed, int hp) {
        setColour(colour);
        setSpeed(speed);
        setHp(hp);
    }


    //getters & setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    //custom methods
    public void accelerator(int amount) {
        //Geef de Acceleratie methode een invulling op basis van (amount + (hp/100)).
        int newSpeed = this.getSpeed() + (amount + (this.getHp() / 100));
        setSpeed(newSpeed);
    }

    public void slow(int amount) {
        //Slow vertraagt de wagen. dit gebaseerd op dezelfde formule al de versnelling maar dan negatief.
        int newSpeed = this.getSpeed() - (amount + (this.getHp() / 100));
        this.setSpeed(newSpeed);
    }

    public void park(int amount) {
        //De park methode zet de snelheid op nul.
        this.setSpeed(0);
    }

    @Override
    public String toString() {
        return "Colour: " + this.getColour()
                + "; Speed: " + this.getSpeed()
                + "; hp: " + this.getHp();
    }
}
