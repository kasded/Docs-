package lv.javaguru.HomeWork2;


//Nav izpildītas uzdevuma prasības
public class ProductTest {
    public static void main(String[] args) {

//        Product product = new Product("Samsung phone", 500, 0.20);
        Product product = new Product("milk", 0.8, 20);

        System.out.println("Product name: " + product.getName() + ", Regular Price: " + product.getRegularPrice()
        + ", Discount " + product.getDiscount() + ", Actual Price " + (( product.getRegularPrice() - product.getRegularPrice() * product.getDiscount()) ));

    }

}
