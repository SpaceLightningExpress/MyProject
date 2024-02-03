import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Information
        //1 Plus
        //2 multiplication
        //3 subtraction
        //4 distribution
        //5 randomzied

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

                case 1:
                    System.out.println("Anda Memilih Penambahan");
                    System.out.println("===============================");

                    System.out.println("Masukan Nomor Pertama");
                    double Penambahannomor1 = scanner.nextDouble();

                    System.out.println("Masukan Nomor Kedua");
                    double Penambahannomor2 = scanner.nextDouble();

                    double Penambahan = Penambahannomor1 + Penambahannomor2;

                    System.out.println(" Hasil dari: " + Penambahannomor1 + " + " + Penambahannomor2 + " = " + Penambahan);
                    System.out.println("===============================");
                    
                    break;
                case 2:
                    System.out.println("===============================");
                    System.out.println("Anda telah Memilih Perkalian");

                    System.out.println("Pilih Nomor Pertama");
                    double Perkaliannomor1 = scanner.nextDouble();

                    System.out.println("Pilih Nomor Kedua");
                    double Perkaliannomor2 = scanner.nextDouble();

                    double Perkalian = Perkaliannomor1 * Perkaliannomor2;

                    System.out.println("Hasil Dari: " + Perkaliannomor1 + " + " + Perkaliannomor2 + " = " + Perkalian);
                    System.out.println("===============================");

                    break;
                case 3:
                    System.out.println("===============================");
                    System.out.println("Anda Memilih Pengurangan");
                    
                    System.out.println("Masukan Nomor Pertama");
                    double Pengurangannomor1 = scanner.nextDouble();

                    System.out.println("Masukan Nomor Kedua");
                    double Pengurangannomor2 = scanner.nextDouble();
                    if (Pengurangannomor2 != 0) ;

                    double Pengurangan = Pengurangannomor1 - Pengurangannomor2;

                    System.out.println("Hasil Dari: " + Pengurangannomor1 + " - " + Pengurangannomor2 + " = " + Pengurangan);
                    System.out.println("===============================");

                    break;
                case 4:
                    System.out.println("===============================");
                    System.out.println("Anda Memilih Pembagian");

                    System.out.println("Masukan Nomor Pertama");
                    double Pembagiannomor1 = scanner.nextDouble();

                    System.out.println("Masukan Nomor Kedua");
                    double Pembagiannomor2 = scanner.nextDouble();
                    if (Pembagiannomor2 != 0) ;

                    double Pembagian = Pembagiannomor1 / Pembagiannomor2;

                    System.out.println("Hasil Dari: " + Pembagiannomor1 + " / " + Pembagiannomor2 + " = " + Pembagian);
                    System.out.println("===============================")

                    break;
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
                    System.out.println("===============================");
                    break;

                default:
                    System.out.println("===============================");
                    System.out.println("Nomor yang anda pilih tidak termasuk dalam kode");
                    System.out.println("===============================");
                    break;
        }
    }
}
