package generative.factoryMethod;

public class SatchelsFactory implements AppleFactory{
    @Override
    public Apple createApple() {
        return new satchelsApple();
    }
}
