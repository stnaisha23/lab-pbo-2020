Judul program : Tugas 1 Praktikum Pemrograman Berorientasi Objek Kelas B

Tujuan program : Untuk memenuhi Mata Kuliah Pemrograman Berorientasi Objek

Author : Siti Nur Aisha

Version : 03/12/20

# Cara instalasi program :
	1. Clone Repository
	   $ git clone
	2. Compile The Code
	   Go to directory where the file is stored in cmd/terminal and run the following command :
	   $ javac Main.java
	3. Run The Program
	   $ java Main

# Penjelasan Program

1. Class Penumpang
   - Class Penumpang akan mewakili atribut penumpang bus.
   - Class Penumpang memiliki beberapa atribut seperti nama yang bertipe String, umur bertipe int
     dan hamil bertipe boolean.
   - Pada Class Penumpang terdapat method Constructor yang berarti akan memberikan nilai awal
     kepada masing-masing atribut.
   - Class Penumpang memiliki method accessor yang akan mengembalikan nilai yang diminta yaitu pada
     method getNama(), getUmur(), dan getHamil().

2. Class Bus
   - Class Bus ini memiliki atribut yang berupa objek dari Class Penumpang
   - Atribut penumpangBiasa hanya dapat menampung penumpang biasa minimal 0 dan maksimal 4, sedangkan pada atribut
     penumpangPrioritas hanya dapat menampung penumpang prioritas minimal 0 dan maksimal 2. 
   - Ketentuannya, penumpang prioritas boleh duduk di kursi penumpang biasa, tetapi penumpang biasa dilarang duduk 
     di kursi penumpang prioritas.
   - Disini untuk menampung data penumpang saya menggunakan struktur ArrayList. 
   - Pada Class Bus ini terdapat method getPenumpangBiasa() dan getPenumpangPrioritas() yang akan mengembalikan list 
     penumpang yang diminta dan method getJumlahPenumpang...() yang akan mengembalikan jumlah penumpang yang diminta. 
   - Method naikPenumpang() berfungsi untuk menambahkan penumpang ke dalam Bus selagi kursi penumpang masih tersedia 
     sehingga mengembalikan nilai true ketika penumpang berhasil naik dan mengembalikan false jika penumpang gagal naik Bus.
   - Method turunPenumpang(nama), disini berarti akan menerima parameter nama penumpang, nama penumpang akan dihapus
     jika nama sudah ditemukan dan akan mengembalikan nilai true, jika sebaliknya maka false.
   - Method toString() disini untuk mencetak daftar-daftar nama Penumpang Biasa, nama Penumpang Prioritas dan Jumlah
     Semua Penumpang.

3. Class Main
   - Pada Class Main terdapat method main() yang akan mensimulasikan proses naik dan turunnya penumpang dari Bus.
   - Pada Class Main saya menggunakan while, setelah memasukkan menu-menu yang dibutuhkan.
   - Karena ada 3 menu, maka menggunakan if, jika pada menu 1 yaitu untuk menaikkan penumpang diminta untuk menampilkan 
     nama, umur dari penumpang dengan hasil dari input user dan menentukan apakah penumpang tersebuthamil atau tidak dengan
     memanggil method naikPenumpang() yang terdapat pada Class Buss. 
   - Lalu pada menu 2 yaitu menurunkan penumpang dengan menginput nama penumpang, apabila nama tersedia makan daftar akan
     dihapus.
   - Dan pada menu 3 untuk menampilkan penumpang, dengan menampilkan nama penumpang biasa dan prioritas dan jumlah penumpang.