import java.util.Scanner;

public class InputOutputDataVariable {
    public static void main(String[] args) {

        // a
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String nama = input.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, "+nama);


        // b
        short a = 5;
        short b = 10;

        double nilai1 = 10.78;
        double nilai2 = 19.787888;

        char first = 'A';
        char second = 'B';

        boolean kaya = true;
        boolean miskin = false;

        // c
        String kata1 = "Saya senang ";
        String kata2 = "belajar";
        String kata3 = " Java Language";
        String kalimat = kata1+kata2+kata3;
        System.out.println(kalimat);
    }
}
