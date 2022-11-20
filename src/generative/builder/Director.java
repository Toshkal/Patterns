package generative.builder;

public class Director {
    Jeweler jeweler;

    public void setJeweler(Jeweler jeweler) {
        this.jeweler = jeweler;
    }
    Jewelry buildJewelry(){
        jeweler.createJewelry();
        jeweler.buildName();
        jeweler.buildPrice();
        jeweler.buildMetal();

        Jewelry jewelry = jeweler.getJewelry();
        return jewelry;
    }
}
