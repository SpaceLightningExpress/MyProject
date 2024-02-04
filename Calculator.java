import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        ==========================
        Select Operation Calculator
        1 Plus
        2 multiplication
        3 subtraction
        4 distribution
        5 randomzied 
        ==========================
        */        
            System.out.println("===============================");
            System.out.println("Pilih Operasi Calculator");
            System.out.println("1. Penambahan  (+)");
            System.out.println("2. Perkalian   (*)");
            System.out.println("3. Pengurangan (-)");
            System.out.println("4. Pembagian   (/)");
            System.out.println("5. AcakRandom  (0)");
            System.out.println("===============================");

        double Pilihan = scanner.nextDouble();

        switch ((int) Pilihan) {
            
            //plus
            case 1:
                    System.out.println("===============================");
                    System.out.println("Anda Memilih Penambahan");

                    System.out.println("Masukan Nomor Pertama");
                    double Penambahannomor1 = scanner.nextDouble();

                    System.out.println("Masukan Nomor Kedua");
                    double Penambahannomor2 = scanner.nextDouble();

                    double Penambahan = Penambahannomor1 + Penambahannomor2;

                    System.out.println(" Hasil dari: " + Penambahannomor1 + " + " + Penambahannomor2 + " = " + Penambahan);
                    break;
                
                //multiplication
                case 2:
                    System.out.println("===============================");
                    System.out.println("Anda telah Memilih Perkalian");

                    System.out.println("Pilih Nomor Pertama");
                    double Perkaliannomor1 = scanner.nextDouble();

                    System.out.println("Pilih Nomor Kedua");
                    double Perkaliannomor2 = scanner.nextDouble();

                    double Perkalian = Perkaliannomor1 * Perkaliannomor2;

                    System.out.println("Hasil Dari: " + Perkaliannomor1 + " + " + Perkaliannomor2 + " = " + Perkalian);
                    break;
                
                //subtraction
                case 3:
                    System.out.println("===============================");
                    System.out.println("Anda Memilih Pengurangan");

                    System.out.println("Masukan Nomor Pertama");
                    double Pengurangannomor1 = scanner.nextDouble();

                    System.out.println("Masukan Nomor Kedua");
                    double Pengurangannomor2 = scanner.nextDouble();

                    double Pengurangan = Pengurangannomor1 - Pengurangannomor2;

                    System.out.println("Hasil Dari: " + Pengurangannomor1 + " - " + Pengurangannomor2 + " = " + Pengurangan);
                    break;

                //distribution
                case 4:
                    System.out.println("===============================");
                    System.out.println("Anda Memilih Pembagian");

                    System.out.println("Masukan Nomor Pertama");
                    double Pembagiannomor1 = scanner.nextDouble();

                    System.out.println("Masukan Nomor Kedua");
                    double Pembagiannomor2 = scanner.nextDouble();

                    double Pembagian = Pembagiannomor1 / Pembagiannomor2;

                    System.out.println("Hasil Dari: " + Pembagiannomor1 + " / " + Pembagiannomor2 + " = " + Pembagian);
                    break;

                //randomized

                    /* 
                        This code runs separately when the number you enter in this code they will do the random number separately
                        int Acak1 = (int) (Math.random() * AcakNomor1);
                        int Acak2 = (int) (Math.random() * AcakNomor2);
                        
                        When the code has got a random number, this code will combine the 2 numbers and get the answer
                        int Acak3 = Acak1 + Acak2;
                        
                        i didnt know if this code was correct or not beacuse i am trying to figure it out but it looks like this should works
                            
                    */
                case 5:
                    System.out.println("===============================");
                    System.out.println("Anda Memilih AcakRandom");

                    System.out.println("Masukan Nomor Akhir");
                    double AcakNomor1 = scanner.nextDouble();

                    System.out.println("Masukan Nomor Akhir");
                    double AcakNomor2 = scanner.nextDouble();

                    int Acak1 = (int) (Math.random() * AcakNomor1);
                    int Acak2 = (int) (Math.random() * AcakNomor2);
                    int Acak3 = Acak1 + Acak2;

                    System.out.println("Nomor Yang Diacak: " + Acak3);
                    break;
                
                //if the console doenst detect any code or any selection this error warning will be send
                default:
                    System.out.println("===============================");
                    System.out.println("Nomor yang anda pilih tidak termasuk dalam kode");
                    break;
            }
        //this code will be exectued at the end of the code runnings
        for (int i = 0; i < 1; i++) {
            System.out.println("===============================");
        }
    }
}
