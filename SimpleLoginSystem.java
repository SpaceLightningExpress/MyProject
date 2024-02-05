import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Username1");
        String Username = scanner.next("Username1");

        System.out.println("Enter Your Password1515");
        String Password = scanner.next("Password1515");

        scanner.close();

            System.out.println("Loading");
            Thread.sleep(2500);

            System.out.println("Correct!!\n" + Username + "\n" + Password);

    }
}




