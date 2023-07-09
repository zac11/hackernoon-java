package telus;

public class halfStarPattern {
    /**
     * This was asked in Telus International Round - 1 for SDET
     * @param args
     */
    public static void main(String [] args){
        int rows = 5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("\t");

            }
            for(int k=1;k<=i;k++){
                System.out.print("*\t");
            }

            System.out.println(" ");
        }

    }


}
