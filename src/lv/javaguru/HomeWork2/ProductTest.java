package lv.javaguru.HomeWork2;

public class ProductTest {
    public static void main(String[] args) {

        printInformation();
        calculateActualPrice();

    }

    private static void calculateActualPrice() {
        Product actualCalculation = new Product();

        actualCalculation.setRegularPrice(0.80);
        actualCalculation.setDiscount(0.20);

        double actualPrice = actualCalculation.getRegularPrice() - actualCalculation.getRegularPrice() * actualCalculation.getDiscount();

        System.out.println("Actual Price: " + actualPrice);
    }

    private static void printInformation() {
        Product productInfo = new Product();
        productInfo.setName("Milk");
        productInfo.setRegularPrice(0.80);
        productInfo.setDiscount(0.20);

        String name = productInfo.getName();
        double regularPrice = productInfo.getRegularPrice();
        double discount = productInfo.getDiscount();

        System.out.println("Product name: " + name + " Regular Price: " + regularPrice + " Discount: " + discount);
    }
}