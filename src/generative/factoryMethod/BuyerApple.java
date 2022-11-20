package generative.factoryMethod;
//Фабричный метод — это порождающий паттерн проектирования, который определяет общий интерфейс
// для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
public class BuyerApple {
    public static void main(String[] args) {
        AppleFactory appleFactory = createVarietyApple("Antonovka");
        Apple apple = appleFactory.createApple();
        apple.varietyApple();
    }
    static AppleFactory createVarietyApple(String variety){
        if (variety.equalsIgnoreCase("WhiteFilling")) {
            return new WhiteFillingFactory();
        } else if (variety.equalsIgnoreCase("Satchels")) {
            return new SatchelsFactory();
        } else if (variety.equalsIgnoreCase("Antonovka")) {
            return new AntonovkaFactory();
        } else {
            throw new RuntimeException(variety + " is unknown variety!!");
        }
    }
}
