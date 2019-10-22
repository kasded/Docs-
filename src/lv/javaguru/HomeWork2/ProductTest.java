package lv.javaguru.HomeWork2;


//Nav izpildītas uzdevuma prasības
public class ProductTest {
    public static void main(String[] args) {

//       Manejais nesaprot bet centos kautka :(
         product printInformation = new product("Milk", 0.8, 0.20);
         product calculateActualPrice = new product("Milk", 0.8, 0.20);

        System.out.println("Product name: " + printInformation.getName() + ", Regular Price: " + printInformation.getRegularPrice()
        + ", Discount " + printInformation.getDiscount() );

        System.out.println("Actual price " + (calculateActualPrice.getRegularPrice() - (calculateActualPrice.getRegularPrice() * calculateActualPrice.getDiscount())));


    }

}
