import java.util.Scanner;

//This Project Is Done Xd I Wanna Improve the calculator with login system ig
public class LoginSystem {
    public static void main(String[] args) {

        //Customized your Password and Username Here
        String Username = "Username";
        String Password = "Password";

        //Userame Input
        String Usernameput;
        String Passwordput;

        Scanner scanner = new Scanner(System.in);

        //Username Login
        System.out.println("Enter Your Username");
        Usernameput = scanner.nextLine();

        System.out.println("Enter Your Password");
        Passwordput = scanner.nextLine();

        /* Loading System Just To Make it Way Cooler
        Miliseconds 2000 its 2 second
        Miliseconds 1500 its 1.5 Second
        MiliSeconds 1000 its 1.0 Second
        Calculate it from google idk if it correct or not */
        System.out.println("Loading.");
        try {
            Thread.sleep(2000); Thread.sleep(1500); System.out.println("Loading.."); Thread.sleep(1000); System.out.println("Loading...");
            //If Correct this Code will Running
            if (Usernameput.equals(Username) && Passwordput.equals(Password)) {
                System.out.println("Correct!!!\nUsername: " + Username + "\nPassword: " + Password);
            } else {
                //If Wrong this Code Will Run With the Password and the Name :D
                System.out.println("Wrong!!!\nUsername: " + Passwordput + "\nPassword: " + Passwordput);
                System.exit(0);
            }
            //Scanner closed
            scanner.close();

            //Import this gae thing i didnt know what is this name
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
