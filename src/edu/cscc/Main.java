package edu.cscc;
import java.util.*;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String cityName;
        Map<String, ArrayList> funMap = new HashMap<>();
        ArrayList<Integer> temps = new ArrayList<>();
        int temp;
        while(true) {
            System.out.println("Please enter a list of city names one at a time:");
            cityName = input.nextLine();

            if(cityName.equalsIgnoreCase("end")) {
                break;
            }
            for(int i = 0; i < 5; i++) {
                System.out.println("Enter temp " + (i+1) + ": ");
                temp = input.nextInt();
                temps.add(temp);
            }
            input.nextLine();

            funMap.put(cityName, temps);

            System.out.println(cityName + " average = " + avg(temps));

        }

        System.out.println("End");

    }

    public static String getInput(Map<String, ArrayList> cityName) {

        return 
    }

    public static double avg(ArrayList<Integer> temps) {
        double avg = (temps.get(0)+temps.get(1)+temps.get(2)+temps.get(3)+temps.get(4))/5;
        return avg;
    }

}
