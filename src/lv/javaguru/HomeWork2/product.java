package lv.javaguru.HomeWork2;

//Ok
public class product {

    private String name;
    private double regularPrice;
    private double discount;

    public product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;

    }

    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }


    }


