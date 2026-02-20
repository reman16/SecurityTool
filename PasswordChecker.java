import java.util.Scanner;

public class PasswordChecker {
   
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password to Check: ");
        String password = scanner.nextLine();

        int passwordScore = calculateScore(password);
        String passwordStrength = getStrength(passwordScore);

        System.out.println("Strength: " + passwordStrength);
    }   

    public static String getStrength(int score){

        if(score < 30){
            return "Weak";
        }
        else if(score < 60){
            return "Moderate";
        }
        else if(score < 80){
            return "Strong";
        }
        else{
            return "Very Strong";
        }
    }
    
    public static int calculateScore(String password){
    
        int score = 0;
    
        if(password.length() < 6){
            score += 10;
        } 
        else if(password.length() < 10){
            score += 30;
        } 
        else {
            score += 50;
        }
        if(password.matches(".*[A-Z].*")){
            score += 15;
        }
        if(password.matches(".*[a-z].*")){
            score += 15;
        }
        if(password.matches(".*[0-9].*")){
            score += 10;
        }
        if(password.matches(".*[^a-zA-Z0-9].*")){
            score += 10;
        }
    
        return score;
    }
    
}

