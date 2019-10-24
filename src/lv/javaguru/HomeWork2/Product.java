package lv.javaguru.HomeWork2;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public void setName(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return this.name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }
}
