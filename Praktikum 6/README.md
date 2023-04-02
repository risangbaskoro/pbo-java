## Praktikum 6

> Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?

Asersi tersebut akan selalu gagal dan menghasilkan error pada saat program dijalankan. Nilai awal variabel  `jariJari`  adalah 0, dan asersi tersebut memastikan bahwa nilai  `jariJari` harus lebih besar dari 0.

> Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?

Ketika eksepsi terjadi, baris 12 **tidak** dieksekusi karena exception akan di-throw sehingga eksekusi diberhentikan.

> Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

Baris 21 akan dieksekusi ketika eksekusi mencapai baris 19. Baris 19 akan melempar AngkaSialException yang kemudian akan ditangkap oleh baris 21, sehingga baris 22-24 akan dijalankan.
