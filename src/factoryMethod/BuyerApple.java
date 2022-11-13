package factoryMethod;

public class BuyerApple {
    public static void main(String[] args) {
        AppleFactory appleFactory = new SatchelsFactory();
        Apple apple = appleFactory.createApple();
        apple.varietyApple();
    }
}
