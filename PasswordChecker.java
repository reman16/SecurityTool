import java.util.Scanner;

public class PasswordChecker {
   
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password to Check: ");
        String password = scanner.nextLine();

        int passwordScore = calculateScore(password);
        String passwordStrength = getStrength(passwordScore);

        System.out.println("\nPassword Score: " + passwordScorescore + "/100");
        System.out.println("Strength: " + passwordStrengthstrength);
    }   

    public static int calculateScore(String password){
        
    }
}
