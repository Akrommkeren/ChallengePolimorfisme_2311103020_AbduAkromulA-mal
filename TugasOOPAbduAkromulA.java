/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasoopabduakromula;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TugasOOPAbduAkromulA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Pilih tipe komputer (Standar/VIP/VVIP): ");
        String tipe = scanner.nextLine();

        System.out.print("Jumlah komputer: ");
        int jumlahKomputer = Integer.parseInt(scanner.nextLine());

        System.out.print("Harga per jam: ");
        double hargaPerJam = Double.parseDouble(scanner.nextLine());

        System.out.print("Jumlah jam pemakaian: ");
        int jamPemakaian = Integer.parseInt(scanner.nextLine());
        System.out.println("===================================");
        Komputer komputer;
        if (tipe.equalsIgnoreCase("VIP")) {
            komputer = new KomputerVIP(jumlahKomputer, hargaPerJam, "Member VIP");
        } else if (tipe.equalsIgnoreCase("VVIP")) {
            komputer = new KomputerVVIP(jumlahKomputer, hargaPerJam, "Ruang VVIP");
        } else {
            komputer = new Komputer(jumlahKomputer, hargaPerJam, "Standar");
        }

        komputer.displayInfo();

        System.out.println("Login dengan username: " + username);
        System.out.println("Bermain selama " + jamPemakaian + " jam");

        double totalBayar = komputer.totalPembayaran(jamPemakaian);
        System.out.println("Total Pembayaran: Rp" + totalBayar);
        
        if (tipe.equalsIgnoreCase("Standar")) {
            System.out.println("BENEFIT MEMBER VIP");
            System.out.println("-Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("-Gratis minuman setiap 4 jam bermain");
            System.out.println("-Prioritas booking komputer gaming");
        }
        scanner.close();
    }
}

