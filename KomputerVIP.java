/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasoopabduakromula;

/**
 *
 * @author ACER
 */
class KomputerVIP extends Komputer {
    public KomputerVIP(int jumlahKomputer, double hargaPerJam, String status) {
        super(jumlahKomputer, hargaPerJam, status);
    }

    public void showBenefitVIP() {
        System.out.println("BENEFIT MEMBER VIP");
        System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
        System.out.println("- Gratis minuman setiap 4 jam bermain");
        System.out.println("- Prioritas booking komputer gaming");
    }

    @Override
    public double totalPembayaran(int jamPemakaian) {
        double total = super.totalPembayaran(jamPemakaian);
        if (jamPemakaian > 3) {
            total *= 0.9; // Diskon 10%
        }
        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        showBenefitVIP();
    }
}
