import java.util.Scanner;

class Segitiga {
    int alas, tinggi;
    
    Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // hitung luas
    public double hitungLuas() {
        return (this.alas * this.tinggi) / 2;
    }
}

class Lingkaran {
    int r;
    final double pi = 3.14;

    Lingkaran(int r) {
        this.r = r;
    }

    public double hitungLuas() {
        return pi * (r * r);
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void display() {
        System.out.println("PROGRAM HITUNG LUAS");
        System.out.println("========================");
        System.out.println("1. Hitung Luas Segitiga");
        System.out.println("2. Hitung Luas Lingkaran");
        System.out.println("3. Exit");
        System.out.println("========================");
        System.out.print("Masukkan pilihan [1/2]: ");
    }
    static void menu() {
        int pilihan;

        while(true) {
            display();
            pilihan = sc.nextInt();
            switch(pilihan) {
                case 1:
                    int a, t;
                    System.out.print("Masukkan alas = ");
                    a = sc.nextInt();
                    System.out.print("Masukkan tinggi = ");
                    t = sc.nextInt();

                    Segitiga segitiga = new Segitiga(a, t);

                    System.out.println("Luas dari segitiga adalah " + segitiga.hitungLuas() + "\n\n");
                    break;
                case 2:
                    int r;
                    System.out.print("Masukkan jari - jari = ");
                    r = sc.nextInt();

                    Lingkaran lingkaran = new Lingkaran(r);

                    System.out.println("Luas dari lingkaran adalah " + lingkaran.hitungLuas() + "\n\n");
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nHarap menginput angka yang tepat!\n");    
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
}