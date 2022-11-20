package generative.factoryMethod;

public class WhiteFillingFactory implements AppleFactory{
    @Override
    public Apple createApple() {
        return new whiteFilling();
    }
}
