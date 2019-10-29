package lv.javaguru.HomeWork3;


// nav gatavs
public class Stock {
    private String company;
    private double currentValue;
    private double max;
    private double min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
    }




    public String getCompany() {
        return company;
    }

    public double getCurrentValue() {

        return currentValue;
    }

    public double getMax() {

        return max;
    }

    public double getMin() {
        return min;



    }

}


