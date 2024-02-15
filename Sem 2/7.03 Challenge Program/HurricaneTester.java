// Gavin Perry, 2024-2-9, The purpose of this program is to dispaly data from a file on hurricanes based on user input
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HurricaneTester
{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("/workspaces/MichiganVirtual/Sem 2/7.03 Challenge Program/hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        int [] categories = new int[numValues];
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        //convert the windspeed, determine categories, calculate sums
        for (int i=0; i<windSpeeds.length; i++)
        {
            windSpeeds[i] = windSpeeds[i] * 1.150779;
            int category = 0;
            if (windSpeeds[i] >= 74 && windSpeeds[i] <= 95)
                category = 1;
            else if (windSpeeds[i] >= 96 && windSpeeds[i] <= 110)
                category = 2;
            else if (windSpeeds[i] >= 111 && windSpeeds[i] <= 129)
                category = 3;
            else if (windSpeeds[i] >= 130 && windSpeeds[i] <= 156)
                category = 4;
            else if (windSpeeds[i] >= 157)
                category = 5;
            categories[i] = category;
        }
        
        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricanes = new ArrayList<Hurricane>();
        for (int i=0; i<years.length; i++)
        {
            hurricanes.add(new Hurricane(years[i], names[i], months[i], categories[i], pressures[i], windSpeeds[i]));
        }
        
        //user prompted for range of years
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of years to see hurricane data for (eg. 1997 2002): ");
        int startYear = input.nextInt();
        int endYear = input.nextInt();
        input.close();
        if (startYear < 1995 || startYear > 2019 || endYear < 1995 || endYear > 2019)
        {
            System.out.println("Invalid year range. Please enter a year between 1995 and 2019");
            System.exit(0);
        }


        System.out.println("Hurricanes " + startYear + " - " + endYear);
        System.out.println();
        System.out.printf("%-6s %-12s %-10s %-8s %-13s %-16s\n", "Year", "Hurricane", "Month", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("======================================================================");
        // calculate average, max, and min category, wind speed, and pressure -> display output
        int maxCat = Integer.MIN_VALUE;
        int minCat = Integer.MAX_VALUE;
        double maxWind = Double.MIN_NORMAL;
        double minWind = Double.MAX_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        int minPressure = Integer.MAX_VALUE;
        int sumCat = 0;
        double sumWind = 0;
        int sumPressure = 0;
        int count = 0;

        for (int i=0; i<hurricanes.size(); i++)
        {
            if (!(hurricanes.get(i).getYear() >= startYear && hurricanes.get(i).getYear() <= endYear))
                continue;

            sumCat += hurricanes.get(i).getCat();
            sumWind += hurricanes.get(i).getWindspeed();
            sumPressure += hurricanes.get(i).getPressure();
            count++;
            if (hurricanes.get(i).getCat() > maxCat)
                maxCat = hurricanes.get(i).getCat();
            if (hurricanes.get(i).getCat() < minCat)
                minCat = hurricanes.get(i).getCat();
            if (hurricanes.get(i).getWindspeed() > maxWind)
                maxWind = hurricanes.get(i).getWindspeed();
            if (hurricanes.get(i).getWindspeed() < minWind)
                minWind = hurricanes.get(i).getWindspeed();
            if (hurricanes.get(i).getPressure() > maxPressure)
                maxPressure = hurricanes.get(i).getPressure();
            if (hurricanes.get(i).getPressure() < minPressure)
                minPressure = hurricanes.get(i).getPressure();
                
            System.out.print(hurricanes.get(i).toString());
        }

        //print the data
        System.out.println("======================================================================");
        System.out.printf("%-30s %8.1f %13.2f %16.2f\n", "Average:", (double) sumCat / count, (double) sumPressure / count, (double) sumWind / count);
        System.out.printf("%-30s %8.1f %13.2f %16.2f\n", "Maximum:", (double) maxCat, (double) maxPressure, (double) maxWind);
        System.out.printf("%-30s %8.1f %13.2f %16.2f\n", "Minimum:", (double) minCat, (double) minPressure, (double) minWind);
    }
}