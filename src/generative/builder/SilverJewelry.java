package generative.builder;

public class SilverJewelry extends Jeweler{
    @Override
    void buildName() {
        jewelry.setName("Silver");
    }

    @Override
    void buildPrice() {
        jewelry.setPrice(5);
    }

    @Override
    void buildMetal() {
        jewelry.setMetal(Metal.SILVER);
    }
}
