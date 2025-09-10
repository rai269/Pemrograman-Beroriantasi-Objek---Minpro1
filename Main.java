package com.mycompany.main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner objekScanner = new Scanner(System.in);
    static ArrayList<String> daftarTiket = new ArrayList<>();

    public static void main(String[] args) {
        initDaftarTiket(); // Inisialisasi data awal

        int pilihan;
        do {
            menuUtama();
            System.out.print("Pilih Menu: ");
            pilihan = objekScanner.nextInt();
            objekScanner.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    lihatTiket();
                    break;

                case 2:
                    tambahTiket();
                    break;

                case 3:
                    editTiket();
                    break;

                case 4:
                    hapusTiket();
                    break;

                case 5:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    System.out.println("Tekan Enter untuk kembali...");
                    objekScanner.nextLine();
            }

        } while (pilihan != 5);

        objekScanner.close();
    }

    public static void menuUtama() {
        System.out.println("\n======= SELAMAT DATANG DI SISTEM TIKETPLANE ========");
        System.out.println("1. Lihat Daftar Tiket");
        System.out.println("2. Tambah Tiket Baru");
        System.out.println("3. Edit Tiket");
        System.out.println("4. Hapus Tiket");
        System.out.println("5. Keluar");
        System.out.println("=====================================================");
    }

    public static void lihatTiket() {
        System.out.println("\n=== DAFTAR TIKET ===");
        if (daftarTiket.isEmpty()) {
            System.out.println("Belum ada tiket.");
        } else {
            for (int i = 0; i < daftarTiket.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTiket.get(i));
            }
        }
        System.out.println("\nTekan Enter untuk kembali...");
        objekScanner.nextLine();
    }

    public static void tambahTiket() {
        System.out.println("\n=== TAMBAH TIKET ===");

        System.out.print("Kode Penerbangan: ");
        String namaPenerbangan = objekScanner.nextLine();

        System.out.print("Maskapai: ");
        String maskapai = objekScanner.nextLine();

        System.out.print("Tujuan: ");
        String tujuan = objekScanner.nextLine();

        System.out.print("Terminal: ");
        String terminal = objekScanner.nextLine();

        System.out.print("Armada Pesawat: ");
        String armada = objekScanner.nextLine();

        String tiketBaru = namaPenerbangan + " | " + maskapai + " | " + tujuan +
                           " | Terminal: " + terminal + " | Armada: " + armada;

        daftarTiket.add(tiketBaru);

        System.out.println("Tiket berhasil ditambahkan!");
        System.out.println("Tekan Enter untuk kembali...");
        objekScanner.nextLine();
    }
    
    public static void editTiket() {
        System.out.println("========= EDIT TIKET ==========");
        
        if (daftarTiket.isEmpty()) {
            System.out.println("Tiket Tidak Tersedia!");
            System.out.println("Tekan Enter untuk kembali...");
            objekScanner.nextLine();
            return;
        }
        
        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println((i + 1) + ". " + daftarTiket.get(i));
        }
        
        System.out.println("Pilih tiket yang ingin diedit: ");
        int nomor = objekScanner.nextInt();
        objekScanner.nextLine();
        
        if (nomor < 1 || nomor > daftarTiket.size()) {
            System.out.println("Nomor tiket tidak valid");
            System.out.println("Tekan Enter untuk kembali...");
            objekScanner.nextLine();
            return;
        }       
        
        System.out.println("========= Edit Data Tiket ============");
        
        System.out.print("Kode Penerbangan Baru: ");
        String kodeBaru = objekScanner.nextLine();
        
        System.out.print("Maskapai Baru: ");
        String maskapaiBaru = objekScanner.nextLine();
        
        System.out.print("Tujuan Baru: ");
        String tujuanBaru = objekScanner.nextLine();
        
        System.out.print("Terminal Baru: ");
        String terminalBaru = objekScanner.nextLine();
        
        System.out.print("Armada Baru: ");
        String armadaBaru = objekScanner.nextLine();
//        objekScanner.nextLine();
        
        String tiketBaru = kodeBaru + " | " + maskapaiBaru + " | " + tujuanBaru +
                       " | " + terminalBaru + " | " + armadaBaru;

        daftarTiket.set(nomor - 1, tiketBaru);

        System.out.println("Tiket berhasil diupdate.");
        System.out.println("Tekan Enter untuk kembali...");
        objekScanner.nextLine();
        menuUtama();
    }
    
    public static void hapusTiket() {
            System.out.println("\n========= HAPUS TIKET ==========");

        if (daftarTiket.isEmpty()) {
            System.out.println("Tiket Tidak Tersedia!");
            System.out.println("Tekan Enter untuk kembali...");
            objekScanner.nextLine();
            return;
        }

        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println((i + 1) + ". " + daftarTiket.get(i));
        }

        System.out.print("Pilih nomor tiket yang ingin dihapus: ");
        int nomor = objekScanner.nextInt();
        objekScanner.nextLine();

        if (nomor < 1 || nomor > daftarTiket.size()) {
            System.out.println("Nomor tiket tidak valid");
            System.out.println("Tekan Enter untuk kembali...");
            objekScanner.nextLine();
            return;
        }

        String tiketDihapus = daftarTiket.remove(nomor - 1);
        System.out.println("Tiket \"" + tiketDihapus + "\" berhasil dihapus.");
        System.out.println("Tekan Enter untuk kembali...");
        objekScanner.nextLine();

    }
        
        


    public static void initDaftarTiket() {
        daftarTiket.add("JT123 | Garuda Indonesia | Balikpapan - Jakarta | Terminal: T3 | Armada: Boeing 737");
        daftarTiket.add("JT456 | Lion Air | Balikpapan - Surabaya | Terminal: T1 | Armada: Airbus A320");
        daftarTiket.add("JT789 | Citilink | Balikpapan - Bali | Terminal: T2 | Armada: ATR 72");
        daftarTiket.add("JT012 | AirAsia | Balikpapan - Yogyakarta | Terminal: T1 | Armada: Airbus A320neo");
        daftarTiket.add("JT345 | Super Air Jet | Balikpapan - Medan | Terminal: T3 | Armada: Boeing 737-800");
    }
}