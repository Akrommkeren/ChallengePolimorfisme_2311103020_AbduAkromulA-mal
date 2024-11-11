/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasoopabduakromula;

/**
 *
 * @author ACER
 */
class Komputer {
    protected int jumlahKomputer;
    protected double hargaPerJam;
    protected String status;

    public Komputer(int jumlahKomputer, double hargaPerJam, String status) {
        this.jumlahKomputer = jumlahKomputer;
        this.hargaPerJam = hargaPerJam;
        this.status = status;
    }

    public double totalPembayaran(int jamPemakaian) {
        return jamPemakaian * hargaPerJam;
    }

    public void displayInfo() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Harga Per Jam   : Rp" + hargaPerJam);
        System.out.println("Status          : " + status);
        System.out.println("===================================");
    }
}