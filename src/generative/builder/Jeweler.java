package generative.builder;

public abstract class Jeweler {
    Jewelry jewelry;
    void createJewelry(){
        jewelry = new Jewelry();
    }
    abstract void buildName();
    abstract void buildPrice();
    abstract void buildMetal();
Jewelry getJewelry(){
    return jewelry;
}
}
