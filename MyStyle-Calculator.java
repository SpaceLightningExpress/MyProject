import java.util.Scanner;

public class CalculatorForBegginers {
   public static void main( String[] args) {

       Scanner scanner = new Scanner(System.in);

       /*
       This Project is acutally the simple one with my own Brain The Project that i made before used
       ChatGpt to helping me so it half stolen code made. This Code is Fully Made By Me Fully Improving my Skill
       On Scanners and am also Figured out how to use Switch More Efficiency by using -> And Hopefully A Begginers
       Would Like to try this code and learn full about it U Can Make Calculator on Java using scanners for more info
       u dont need to use break code now
       */
       System.out.println("1.Penambahan(+)\n2.Pengurangan(-)\n3.Perkalian(*)\n4.Pembagian(/)");

       int Selection = scanner.nextInt();

       switch(Selection) {
           default -> {
               System.out.print("Error u didnt select the correct one");
           }
           case 1 -> {
               System.out.println("Put Your First Number");
               int p1 = scanner.nextInt();
               System.out.println(p1 + " + " + "..");
               int p2 = scanner.nextInt();
               System.out.println(p1 + " + " + p2);
               int tambah = p1 + p2;
               System.out.println("The Result" + " + " + p2 + " = " + tambah);
           }

           case 2 -> {
               System.out.println("Put Your First Number");
               int p3 = scanner.nextInt();
               System.out.println(p3 + " - " + "..");
               int p4 = scanner.nextInt();
               System.out.println(p3 + " - " + p4);
               int kurang = p3 - p4;
               System.out.println("The Result" + p3 + " - " + p4 + " = " + kurang);
           }

           case 3 -> {
               System.out.println("Put Your First Number");
               int p5 = scanner.nextInt();
               System.out.println(p5 + " * " + "..");
               int p6 = scanner.nextInt();
               System.out.println(p5 + " * " + p6);
               int perkalian = p5 * p6;
               System.out.println("The Result" + p5 + " * " + p6 + " = " + perkalian);
           }

           case 4 -> {
               System.out.println("Put Your First Number");
               int p7 = scanner.nextInt();
               System.out.println(p7 + " / " + "..");
               int p8 = scanner.nextInt();
               System.out.println(p7 + " / " +p8);
               int pembagian = p7 / p8;
               System.out.println("The Result" + p7 + " / " + p8 + " = " + pembagian);


           }

       }

    }
}
