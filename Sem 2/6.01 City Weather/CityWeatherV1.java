/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private String[] months;
    private double[] precipitation;
    private double[] temperature;
    
    // constructor with parameters
    public CityWeatherV1(String[] months, double[] precipitation, double[] temperature) {
        this.months = months;
        this.precipitation = precipitation;
        this.temperature = temperature;
    }
    // setters and getters for each private instance variable
    public String[] getMonths() {
        return months;
    }
    public void setMonths(String[] months) {
        this.months = months;
    }
    public double[] getPrecipitation() {
        return precipitation;
    }
    public void setPrecipitation(double[] precipitation) {
        this.precipitation = precipitation;
    }
    public double[] getTemperature() {
        return temperature;
    }
    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }
    // method to calculate the average of temperature
    public double averageTemperature() {
        double sum = 0;
        for (int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
        }
        return sum / temperature.length;
    }
    // method to calculate total precipitation array
    public double totalPrecipitation() {
        double sum = 0;
        for (int i = 0; i < precipitation.length; i++) {
            sum += precipitation[i];
        }
        return sum;
    }   
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
