import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        //Get input
        Scanner s = new Scanner(System.in);
        System.out.println("NUMBER PLS");
        String stringInput = s.nextLine();
        int n = Integer.parseInt(stringInput); //No try/except due to exercise scope

        //Print original number
        System.out.println("NUMBER: " + n);

        //Get all factors
        int noOfFacts = 0;
        int total = 1;
        System.out.println("FACTORS:");
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) { //Loop twice to catch identical number factors (2x2, 3x3...)
                if ((i * j) == n) { //
                    noOfFacts++;
                    if(i != n && j != n) total += i; //Add to perfect total if the iteration isn't the input number
                    System.out.print(i + " "); //print to keep on once line, and only add i to prevent duplicates
                }
            }
        }
        System.out.println("\nFACTOR COUNT: " + noOfFacts); //New line to separate from factors
        if(total == n) System.out.println("NUMBER IS PERFECT");

        //Get all primes
        System.out.println("PRIMES:");
        for (int i = n/2; i != 1; i--) {
            if (n%i == 0) System.out.print(i + " ");
        }
    }
}
