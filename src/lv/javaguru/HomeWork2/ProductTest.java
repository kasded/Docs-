package lv.javaguru.HomeWork2;

public class ProductTest {
    public static void main(String[] args) {
        Product productInfo = new Product();

        printInformation(productInfo);
        calculateActualPrice();

    }

    private static void calculateActualPrice() {
        Product actualCalculation = new Product();

        actualCalculation.setRegularPrice(0.80);
        actualCalculation.setDiscount(0.20);


        double actualPrice = actualCalculation.getRegularPrice() - actualCalculation.getRegularPrice() * actualCalculation.getDiscount();

        System.out.println("Actual Price: " + actualPrice);
    }

    private static void printInformation(Product printInformation) {
        printInformation.setName("Milk");
        printInformation.setRegularPrice(0.80);
        printInformation.setDiscount(0.20);

        String name = printInformation.getName();
        double regularPrice = printInformation.getRegularPrice();
        double discount = printInformation.getDiscount();

        System.out.println("Product name: " + name + " Regular Price: " + regularPrice + " Discount: " + discount);
    }
}