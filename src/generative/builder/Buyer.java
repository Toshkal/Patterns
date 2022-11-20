package generative.builder;
//Строитель — это порождающий паттерн проектирования, который позволяет создавать сложные объекты пошагово.
// Строитель даёт возможность использовать один и тот же код строительства для получения разных представлений объектов.
public class Buyer {
    public static void main(String[] args) {
        Director director = new Director();
        director.setJeweler(new GoldJewelry());
        Jewelry jewelry = director.buildJewelry();

        System.out.println(jewelry);
    }
}
