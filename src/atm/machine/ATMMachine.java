/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.machine;

/**
 *
 * @author mlarrubia
 */
import java.util.Scanner;
public class ATMMachine {

    /**
     * @param args the command line arguments
     */
    static Scanner kb = new Scanner(System.in);
    
    private static final String USERNAME = "user";
    private static final int PIN = 1234; 
    private static int accountBalance = 0;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Please enter your username: ");
        String userName = kb.nextLine();
        System.out.println("Please enter your password: ");
        int passWord = kb.nextInt();
        
        if (credentialsCheck(userName,passWord) == true){
            if (accountManagement() == 1)
                checkAccountBalance();
        }
        
        
    }
    
    public static boolean credentialsCheck (String userName, int passWord){
        if (userName.equals(USERNAME) || passWord == PIN){
            System.out.println("Welcome.");
            return true;
        }
        else {
            System.out.println("Incorrect username or password.");
            return false;
        
        
        }
    }
    
    public static int accountManagement (){
        System.out.println("************Menu************");
        System.out.println("");
        System.out.println("1. Check Account Balance \n 2. Deposit Checks \n 3. Withdraw Money \n 4. Logout");
        int action = kb.nextInt();
        return action;
    }
    
    public static int checkAccountBalance (){
        System.out.println(accountBalance);
        return accountBalance;
    }
    
    public static int depositChekcs(){
        System.out.println("Please indicate how many check you would like to deposit.");
        int numberOfChecks = kb.nextInt();
        if(numberOfChecks == 1){
            System.out.println("Please insert the check's value and the check.");
            int valueOfCheck = kb.nextInt();
            accountBalance += valueOfCheck;
        }
        else{
            for ()
        }
    }
    
    
}
