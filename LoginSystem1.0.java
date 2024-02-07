import java.util.Scanner;

//Login System 1.0
public class SimpleLoginSystem {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Username1");
        String Username = scanner.next();

        System.out.println("Enter Your Password1515");
        String Password = scanner.next();

        scanner.close();

        System.out.println("Loading");
        Thread.sleep(2500);

        if (Password.equals("Password1515") && Username.equals("Username1")) {
            System.out.println("Correct!!\n" + Username + "\n" + Password);
    }else{
            System.out.println("Wrong!!");
        }
    }
}




