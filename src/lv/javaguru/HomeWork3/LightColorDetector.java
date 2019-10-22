package lv.javaguru.HomeWork3;

public class LightColorDetector {

    public boolean isNumber(int lengthOfWave) {
        if (lengthOfWave >= 380 || lengthOfWave <= 449 || lengthOfWave >= 450
             || lengthOfWave <= 494) {

            return true;
        } else {
            return false;
        }

    }
}