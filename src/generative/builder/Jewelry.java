package generative.builder;

public class Jewelry {
    private String name;
    private int price;
    private Metal metal;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Jewelry{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", metal=" + metal +
                '}';
    }
}
