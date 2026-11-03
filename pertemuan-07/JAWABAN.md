# Pertemuan 7 – Overriding dan Overloading: Tugas Mandiri

## Tugas 1 – Override `BusinessAccount`
Lihat `BusinessAccount.java`: `canWithdraw(double)` di-override dengan `@Override` (saldo setelah penarikan wajib ≥ 1000000) dan `printInfo()` di-override dengan `@Override` (memanggil `super.printInfo()` lalu mencetak jenis rekening). Bukti di `Main.java` bagian "Tugas Mandiri 1": saldo 2000000, tarik 1500000 ditolak (`false`) karena sisa 500000 < 1000000, dan `printInfo()` mencetak baris Account diikuti `Account type: Business, monthly fee: 25000.0`.

## Tugas 2
**(a)** Method yang di-override (`canWithdraw()`, `printInfo()`) memiliki signature yang sama persis dengan versi di superclass (nama dan daftar parameter sama), hanya isinya berbeda. Method yang di-overload (`deposit()`) memiliki nama yang sama tetapi daftar parameter berbeda (`deposit(double)` dan `deposit(double, String)`).

**(b)** Pada overriding, versi yang dijalankan ditentukan saat program berjalan (runtime) berdasarkan jenis objek sebenarnya. Pada overloading, versi dipilih oleh compiler saat kompilasi berdasarkan jumlah dan tipe argumen pada pemanggilan.
