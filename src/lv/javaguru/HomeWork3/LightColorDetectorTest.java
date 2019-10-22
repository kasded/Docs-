package lv.javaguru.HomeWork3;

public class LightColorDetectorTest {

    static void check(boolean expectedResult,
                      boolean actualResult,
                      String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has PASSED");
        } else {
            System.out.println(testName + " has FAILED");
            System.out.println("Actual: " + actualResult + ", Expected: "+ expectedResult);
        }
    }

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        boolean expectedResult = true;
        boolean actualResult = lightColorDetector.isNumber(450);
        check(expectedResult, actualResult, "shouldBeViolet_380_449");

    }

}
