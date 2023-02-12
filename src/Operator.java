
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(".: TUGAS WEEK 3 :.");
        System.out.println("1. luas lingkaran");
        System.out.println("2. volume balok");
        System.out.print("Silahkan pilih menu : ");

        int pilihan = input.nextInt();

        switch (pilihan){
            case 1 :
                luasLingkaran();
                break;
            case 2 :
                volumeBalok();
                break;
            default:
                System.out.println("pilihan anda salah");
                break;
        }
    }

    static void luasLingkaran(){
        Scanner input = new Scanner(System.in);
        double PHI = 3.14;
        System.out.print("masukkan jari jari lingkaran : ");
        double r = input.nextDouble();
        double luas = PHI * r * r;
        System.out.println("luas lingkaran adalah : "+luas);
    }

    static void volumeBalok(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan panjang :");
        double panjang = input.nextDouble();
        System.out.print("masukkan lebar :");
        double lebar = input.nextDouble();
        System.out.print("masukkan tinggi :");
        double tinggi = input.nextDouble();

        double volume = panjang*lebar*tinggi;
        System.out.println("volume balok adalah : "+volume);
    }
}
