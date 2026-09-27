/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajaroop;

/**
 *
 * @author Gusthi Pangestu
 */
public class BelajarOOP {
    public static void main (String[] args) {
        AkunBank akun = new AkunBank("REK-8899", 50000);
        
        System.out.println("Nomer Rekening : " + akun.getNomerRekening());
        System.out.println("Saldo         : Rp" + akun.getSaldo());
        
        akun.tambahSaldo(25000);
        System.out.println("Saldo Terkini : Rp" + akun.getSaldo());
        
        akun.tambahSaldo(-10000);
        
        AkunTabungan tabungan = new AkunTabungan("TAB-7700", 100000, 10.0);
        
        System.out.println("Nomer Tabungan : " + tabungan.getNomerRekening());
        System.out.println("Saldo Awal     : Rp" + tabungan.getSaldo());
        
        tabungan.tambahBunga();
        System.out.println("Saldo Akhir    : Rp" + tabungan.getSaldo());
        
        AkunGiro giro = new AkunGiro("GIRO-9900", 250000, 5000);
        AkunBank [] kumpulanAkun = { akun, tabungan, giro };
        
        for (AkunBank setiapAkun : kumpulanAkun) {
            akun.cetakInformasi();
        }
        
    }
}

