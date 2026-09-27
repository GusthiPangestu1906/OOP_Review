/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop;

/**
 *
 * @author Gusthi Pangestu
 */
public class AkunGiro extends AkunBank {
    private double biayaAdmin;

    public AkunGiro(String nomerRekening, double saldoAwal, double biayaAdmin) {
        super(nomerRekening, saldoAwal);
        this.biayaAdmin = biayaAdmin;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("[Akun Giro Bisnis] Rekening: " + getNomerRekening() 
                + " | Saldo: Rp" + getSaldo() 
                + " | Biaya Potongan Admin: Rp" + biayaAdmin);
    }
}
