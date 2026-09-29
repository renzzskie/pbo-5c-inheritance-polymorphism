import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Demo polymorphism: array bertipe Bentuk berisi berbagai objek turunan
        Bentuk[] daftar = {
            new Bentuk("Merah"),
            new BujurSangkar(4, "Biru"),
            new Lingkaran(7, "Hijau"),
            new Silinder(10, 3, "Kuning")
        };

        System.out.println("=== Demo Polymorphism ===");
        for (Bentuk b : daftar) {
            b.printInfo(); // method yang dipanggil sesuai tipe objek sebenarnya
        }

        // Menu sederhana (opsional)
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Bujursangkar");
            System.out.println("2. Lingkaran");
            System.out.println("3. Silinder");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                Bentuk bentuk = null;

                if (pilihan == 1) {
                    System.out.print("Sisi: ");
                    bentuk = new BujurSangkar(sc.nextDouble(), warna);
                } else if (pilihan == 2) {
                    System.out.print("Radius: ");
                    bentuk = new Lingkaran(sc.nextDouble(), warna);
                } else {
                    System.out.print("Radius: ");
                    double r = sc.nextDouble();
                    System.out.print("Tinggi: ");
                    double t = sc.nextDouble();
                    bentuk = new Silinder(t, r, warna);
                }
                bentuk.printInfo();
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        System.out.println("Program selesai.");
        sc.close();
    }
}
