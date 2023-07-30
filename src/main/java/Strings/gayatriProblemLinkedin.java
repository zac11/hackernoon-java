package Strings;

public class gayatriProblemLinkedin {



        public static void main(String[] args) {
            String[] cities = {"Mumbai", "Hyderabad", "Bangalore", "Pune"};
            String targetCity = "Mumbai";

            boolean found = isCityPresent(cities, targetCity);
            if (found) {
                System.out.println(targetCity + " is present in the array.");
            } else {
                System.out.println(targetCity + " is not present in the array.");
            }
        }

        static boolean isCityPresent(String[] cities, String targetCity) {
            for (String city : cities) {
                if (city.equals(targetCity)) {
                    return true;
                }
            }
            return false;
        }


}
