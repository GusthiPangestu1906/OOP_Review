/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop;

/**
 *
 * @author Gusthi Pangestu
 */
public class AkunTabungan extends AkunBank {
    private double bungaPersen;
    
    public AkunTabungan(String nomerRekening, double saldoAwal, double bungaPersen) {
        super(nomerRekening, saldoAwal);
        this.bungaPersen = bungaPersen;
    }
    
    public void tambahBunga() {
        double nominalBunga = getSaldo() * (bungaPersen / 100.0);
        tambahSaldo(nominalBunga);
        System.out.println("Bunga " + bungaPersen + "% diterapkan: +Rp" + nominalBunga);
    }
    
    @Override
    public void cetakInformasi() {
        System.out.println("[Akun Tabungan] Rekening: " + getNomerRekening()
                +   " | Saldo : Rp" + getSaldo()
                +   " | Bunga : " + bungaPersen + "%");
    }
}
