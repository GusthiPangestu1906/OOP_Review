# OOP Review (Belajar OOP)

Proyek pembelajaran konsep Object-Oriented Programming (OOP) menggunakan Java di Apache NetBeans.

## Konsep yang Diimplementasikan
- **Class & Object**: Struktur dasar pembuatan akun bank (`AkunBank`).
- **Enkapsulasi (Encapsulation)**: Proteksi atribut `saldo` dan `nomerRekening` menggunakan access modifier `private` serta method getter dan validasi pada setter/mutator.
- **Pewarisan (Inheritance)**: Subclass `AkunTabungan` dan `AkunGiro` yang mewarisi class `AkunBank`.
- **Polimorfisme (Polymorphism)**: Dynamic method dispatch / method overriding pada method `cetakInformasi()`.

## Struktur Proyek
- `src/belajaroop/AkunBank.java`: Superclass representasi akun bank standar.
- `src/belajaroop/AkunTabungan.java`: Subclass akun tabungan dengan fitur bunga.
- `src/belajaroop/AkunGiro.java`: Subclass akun giro bisnis dengan biaya potongan admin.
- `src/belajaroop/BelajarOOP.java`: Main class runner untuk mendemonstrasikan fungsi sistem.
