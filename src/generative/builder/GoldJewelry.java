package generative.builder;

public class GoldJewelry extends Jeweler{
    @Override
    void buildName() {
        jewelry.setName("Gold");
    }

    @Override
    void buildPrice() {
        jewelry.setPrice(10);
    }

    @Override
    void buildMetal() {
        jewelry.setMetal(Metal.GOLD);
    }
}
