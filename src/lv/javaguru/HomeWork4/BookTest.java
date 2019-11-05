package lv.javaguru.HomeWork4;

public class BookTest {
    public static void main(String[] args) {

        //tests neprecīzi aprkastīts
//        Book equals true Test
//                FAILED
//        Expected: true
//        Actual: false
//        Book: {  author: Leo Tolstoy, title: War and Peace, page count: 1225 }
//        Book: {  author: J. R. R. Tolkien, title: The Hobbit, page count: 304 }

        // trūkst gadījuma testa    , kad objekti ir vienādi
        Book warAndPeace = new Book("Leo Tolstoy", "War and Peace", 1225 );
        Book theHobbit = new Book("J. R. R. Tolkien", "The Hobbit", 304 );
        boolean expectedResult = true;

        System.out.println("Book equals true Test");
        boolean actualResult = warAndPeace.equals(theHobbit);

        if(actualResult) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual: " + actualResult);

        }

        System.out.println(warAndPeace);
        System.out.println(theHobbit);

    }
}
