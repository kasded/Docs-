package lv.javaguru.HomeWork2;



public class ProductTest {
    public static void main(String[] args) {

        Product product = new Product("Samsung phone", 500, 0.20);

        System.out.println("Product name: " + product.getName() + ", Regular Price: " + product.getRegularPrice()
        + ", Discount " + product.getDiscount() + ", Actual Price " + (( product.getRegularPrice() - product.getRegularPrice() * product.getDiscount()) ));

    }

}
