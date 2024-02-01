import java.util.Scanner;

public class EX4 {

    
    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    
    static double getRateOfInterest(boolean isSeniorCitizen) {
        return isSeniorCitizen ? 12.0 : 10.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        
        System.out.print("Is the customer a senior citizen? (true/false): ");
        boolean isSeniorCitizen = scanner.nextBoolean();

       
        double rate = getRateOfInterest(isSeniorCitizen);

        
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}