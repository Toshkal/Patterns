package factoryMethod;

public class AntonovkaFactory implements AppleFactory {
    @Override
    public Apple createApple() {
        return new antonovkaApple();
    }
}
