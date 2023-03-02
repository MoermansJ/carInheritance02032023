package be.intecbrussel;

public class Suv extends Car {
    //properties
    private boolean bullbar;
    private boolean is4x4enabled;


    //constructors
    public Suv() {
        this("DEFAULT_SUV_COLOUR_VALUE", 0, 1);
    }

    public Suv(String colour, int speed, int hp) {
        super(colour, speed, hp);
    }


    //getters & setters
    public boolean hasBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public boolean getIs4x4enabled() {
        return is4x4enabled;
    }

    private void setIs4x4enabled(boolean is4x4enabled) {
        this.is4x4enabled = is4x4enabled;
    }

    //custom methods
    public void driving4x4() {
        this.setIs4x4enabled(!this.getIs4x4enabled());
    }

    @Override
    public void accelerator(int amount) {
        int newSpeed = this.getSpeed() + (amount + (this.getHp() / 100));
        this.setSpeed(newSpeed);

        if (this.getIs4x4enabled() && this.getSpeed() > 30) {
            this.setSpeed(30);
        }
    }

    @Override
    public String toString() {
        return "Data-type: SUV; Colour: " + this.getColour()
                + "; Speed: " + this.getSpeed()
                + "; hp: " + this.getHp()
                + "; bullbar: " + this.hasBullbar()
                + "; is4x4enabled: " + this.getIs4x4enabled();
    }
}
