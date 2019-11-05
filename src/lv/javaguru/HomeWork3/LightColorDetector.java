package lv.javaguru.HomeWork3;

//lietojam ctrl = alt + l
public class LightColorDetector {
    public String detect(int wavelength) {

        //šeit labak izmantot if -> else if -> else konstrukciju
        //jo intervāli nepārklājas
        //šāds pieraksts maldina ar to ka teorētiski sie intervali var pārklāties
        if ((wavelength >= 380) && (wavelength <= 449)) {
            return "Violet";
        }
        if ((wavelength >= 450) && (wavelength <= 494)) {
            return "Blue";
        }
        if ((wavelength >= 495) && (wavelength <= 569)) {
            return "Green";
        }
        if ((wavelength >= 570) && (wavelength <= 589)) {
            return "Yellow";
        }
        if ((wavelength >= 590) && (wavelength <= 619)) {
            return "Orange";
        }
        if ((wavelength >= 620) && (wavelength <= 750)) {
            return "Red";
        }
    return "No valid number";
    }
}
