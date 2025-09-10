# Pemrograman-Beroriantasi-Objek

Nama: Rehan Fariz
NIM: 2409116083

## Deskripsi Program
Program ini merupakan simulasi sistem manajemen tiket penerbangan sederhana berbasis Java. Fungsionalitas utama meliputi:
- Menampilkan daftar tiket

- Menambahkan tiket baru

- Mengedit tiket yang sudah ada

- Menghapus tiket

- Keluar dari program


Program menggunakan pendekatan berbasis objek dan struktur modular agar mudah dikembangkan dan dipahami.

## Struktur Class dan Fungsinya
Program ini hanya menggunakan satu class utama yaitu , namun di dalamnya terdapat beberapa method modular yang berfungsi sebagai controller dan UI interaktif.
### 1. Main.java
Class utama yang berisi method  dan seluruh logika program.


#### a. Import Package

`` package com.mycompany.main; ``

Scanner digunakan untuk mengambil input dari user.

ArrayList digunakan untuk menyimpan daftar tiket secara dinamis.



#### b. Inisialisasi Data

`` static Scanner objekScanner = new Scanner(System.in);
static ArrayList<String> daftarTiket = new ArrayList<>(); ``

objekScanner → objek untuk membaca input user.

daftarTiket → menampung semua data tiket yang tersedia.



#### c. menuUtama()

`` public static void menuUtama() {
    System.out.println("\n======= SELAMAT DATANG DI SISTEM TIKETPLANE ========");
    System.out.println("1. Lihat Daftar Tiket");
    System.out.println("2. Tambah Tiket Baru");
    System.out.println("3. Edit Tiket");
    System.out.println("4. Hapus Tiket");
    System.out.println("5. Keluar");
    System.out.println("=====================================================");
} ``

Method ini menampilkan menu pilihan untuk user dan melakukan input agar user, di antaranya adalah:

1. Lihat Daftar Tiket

2. Tambah Tiket Baru

3. Edit Tiket

4. Hapus Tiket

5. Keluar



#### d. lihatTiket()

`` public static void lihatTiket() {
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
} ``

Fungsi dari method lihatTiket() adalah untuk menampilkan semua tiket yang sudah ada di dalam sistem.

Jika kosong sistem akan memberi tahu bahwa tiket belum tersedia.



#### e. tambahTiket()

`` public static void tambahTiket() {
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
} ``


Mengedit tiket yang sudah ada berdasarkan nomor indeks.

f. tambahTiket()
Menghapus tiket dari daftar berdasarkan nomor indeks.

g. 
Mengisi daftar tiket dengan data awal untuk simulasi.


🧪 Simulasi Data Awal
Berikut adalah data tiket yang diinisialisasi saat program dijalankan:
1. 	JT123  Garuda Indonesia  Balikpapan - Jakarta  Terminal: T3  Armada: Boeing 737
2. 	JT456  Lion Air  Balikpapan - Surabaya  Terminal: T1  Armada: Airbus A320
3. 	JT789  Citilink  Balikpapan - Bali  Terminal: T2  Armada: ATR 72
4. 	JT012  AirAsia  Balikpapan - Yogyakarta  Terminal: T1  Armada: Airbus A320neo
5. 	JT345  Super Air Jet  Balikpapan - Medan  Terminal: T3  Armada: Boeing 737-800
