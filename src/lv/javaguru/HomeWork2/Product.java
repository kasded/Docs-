package lv.javaguru.HomeWork2;

//Ok
public class Product {

    private String name;
    private double regularPrice;
    private double discount;
    private double actualPrice;  //lieks mainīgais - nav izmatots. Tātad dzēšam

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;


    }

    //Tāpat arī visas šīs metodes "setName", "setRegularPrice", "setDiscount", "setActualPrice" dzēšam, jo tās netiek izmantotas
    public void setName(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
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
