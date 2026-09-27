/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajaroop;

/**
 *
 * @author Gusthi Pangestu
 */
public class AkunBank {
    private String nomerRekening;
    private double saldo;

    public AkunBank(String nomerRekening, double saldoAwal) {
        this.nomerRekening = nomerRekening;
        this.saldo = saldoAwal;
    }

    public void tambahSaldo(double nominal) {
        if (nominal > 0) {
            this.saldo += nominal;
            System.out.println("Enkapsulasi Berhasil saldo Rp" + nominal);
        } else {
            System.out.println("Enkapsulasi Gagal karena nominal negatif");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNomerRekening() {
        return this.nomerRekening;
    }
    
    public void cetakInformasi() {
        System.out.println("[Akun Bank Standar] Rekening " + nomerRekening + " | Saldo: Rp" + saldo);
    }
}
