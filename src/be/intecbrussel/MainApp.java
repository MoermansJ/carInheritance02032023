package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
//        Een rode Suv met 250hp
        Suv mySuv = new Suv("RED", 25, 250);

//        Een gele Cabrio met 200hp
        Cabrio myCabrio = new Cabrio("YELLOW", 25, 200);

//        Een groene Elektrische wagen met 60% opgeladen batterij.
        ElektrischeWagen myElektrischeWagen = new ElektrischeWagen("GREEN", 25, 200, 0);
        myElektrischeWagen.charge(60);


//        Zorg er ook voor dat alle auto's versnellen met 50. Laat zien
//        hoeveel ze na toepassing van de formule echt rijden op dit moment.
        mySuv.accelerator(50);
        System.out.println("Current SUV speed (4x4 Drive: " + mySuv.getIs4x4enabled() + "): " + mySuv.getSpeed());

        myCabrio.accelerator(50);
        System.out.println("Current Cabrio speed: " + myCabrio.getSpeed());

        myElektrischeWagen.accelerator(50);
        System.out.println("Current ElektrischeWagen speed: " + myElektrischeWagen.getSpeed());


        //Parkeer ook alle auto's probeer dit in 1 loop te doen door
        //bijvoorbeeld te werken met aan Auro Array
        Car[] carArray = {mySuv, myCabrio, myElektrischeWagen};

        for (Car c : carArray) {
            c.park(0);
        }

        System.out.println(mySuv + "\n" + myCabrio + "\n" + myElektrischeWagen);
    }
}
