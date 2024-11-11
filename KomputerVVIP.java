/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasoopabduakromula;

/**
 *
 * @author ACER
 */
class KomputerVVIP extends Komputer {
    public KomputerVVIP(int jumlahKomputer, double hargaPerJam, String status) {
        super(jumlahKomputer, hargaPerJam, status);
    }

    public void fasilitasRuangPrivat() {
        System.out.println("FASILITAS RUANGAN VVIP");
        System.out.println("-Ruangan berAC pribadi");
        System.out.println("-Sofa gaming exclusive");
        System.out.println("-Komputer spesifikasi tinggi");
        System.out.println("-Koneksi internet dedicated 100Mbps");
    }

    @Override
    public double totalPembayaran(int jamPemakaian) {
        double total = super.totalPembayaran(jamPemakaian);
        total += 5000 * jamPemakaian; // Biaya tambahan untuk ruang privat
        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        fasilitasRuangPrivat();
    }
}

