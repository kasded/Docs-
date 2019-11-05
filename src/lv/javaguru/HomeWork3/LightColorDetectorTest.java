package lv.javaguru.HomeWork3;

//Ok
public class LightColorDetectorTest {
    public static void main(String[] args) {
        testDetectViolet();

        testDetectBlue();

        testDetectGreen();

        testDetectYellow();

        testDetectOrange();

        testDetectRed();

    }

    private static void testDetectRed() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(750);
        System.out.println("Result: " + result);
    }

    private static void testDetectOrange() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(590);
        System.out.println("Result: " + result);
    }

    private static void testDetectYellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(580);
        System.out.println("Result: " + result);
    }

    private static void testDetectGreen() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(500);
        System.out.println("Result: " + result);
    }

    private static void testDetectBlue() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(470);
        System.out.println("Result: " + result);
    }

    private static void testDetectViolet() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(449);
        System.out.println("Result: " + result);
    }
}