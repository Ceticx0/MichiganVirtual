// Gavin Perry, 1/25/2024, Test City Weather V2 file and display output.
import java.util.Scanner;
public class CityWeatherTesterV2
{
    
   
    
    // method to print results (formatting output will be done in 6.02)
    public static void printResults(String[] months, double[] temperature, double[] precipitation, String tempLabel, String precipLabel, double avgTemp, double totalPercipitation, String city, String state) {
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {

            System.out.printf("%-10s%10.1f%15.1f%n", months[index], temperature[index], precipitation[index]);
        }
        System.out.printf("Average Temperature: %.2f%n", avgTemp);
        System.out.printf("Total Percipitation: %.2f%n", totalPercipitation);

    }
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "";  //choose a city from the table provided
        String state = "";  //choose a city from the table provided
  
        String[] month = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double[] temperature = {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};
        double[] precipitation = {4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        
        //instantiate CityWeatherV1 object 
        CityWeatherV2 tampaWeather = new CityWeatherV2(month, precipitation, temperature);
        //print average temperature and total precipitation
        double avgTemp = tampaWeather.averageTemperature();
        double totalPercipitation = tampaWeather.totalPrecipitation();
        //input to decide F/C and in/cm - to be completed in 6.02
        System.out.println("Enter F for Fahrenheit or C for Celsius: ");
        tempLabel = in.next();
        System.out.println("Enter in for inches or cm for centimeters: ");
        precipLabel = in.next();
        //conditions & method call to convert temp, if needed - to be completed in 6.02
        if (tempLabel.equalsIgnoreCase("C")) {
            double[] celTemps = new double[temperature.length];
            for (int i = 0; i < temperature.length; i++) {
                celTemps[i] = tampaWeather.celsiusTemperature(i);
            }
            tampaWeather.setTemperature(celTemps);
        }
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        if (precipLabel.equalsIgnoreCase("cm")) {
            double[] centimetersPrecipitation = new double[temperature.length];
            for (int i = 0; i < temperature.length; i++) {
                centimetersPrecipitation[i] = tampaWeather.cmPrecipitation(i);
            }
            tampaWeather.setPrecipitation(centimetersPrecipitation);
        }
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
        CityWeatherTesterV2.printResults(tampaWeather.getMonths(), tampaWeather.getTemperature(), tampaWeather.getPrecipitation(), tempLabel, precipLabel, tampaWeather.averageTemperature(), tampaWeather.totalPrecipitation(), city, state);  


    }//end main
}//end class

