
# APLIKASI FORMULIR DATA MAHASISWA

## Deskripsi
Aplikasi Formulir Data Mahasiswa merupakan program Graphical User Interface (GUI) menggunakan bahasa pemrograman Java dengan library Java Swing. Aplikasi ini dibuat untuk mengeksplorasi komponen GUI, pengaturan tata letak (Layout), dan penggunaan Event Listener.
Program memungkinkan pengguna memasukkan nama, NIM, serta memilih program studi mahasiswa. Data kemudian diproses melalui tombol Simpan Data dan ditampilkan dalam kotak dialog.

## 1. Top-Level Container
**Class: JFrame**

JFrame merupakan wadah utama yang digunakan untuk membentuk jendela aplikasi. Dalam program ini, JFrame digunakan sebagai kerangka utama formulir dengan judul Formulir Data Mahasiswa. JFrame juga mengatur ukuran jendela, posisi tampilan, dan operasi penutupan aplikasi.

## 2. Intermediate Container
**Class: JPanel**

JPanel digunakan sebagai wadah untuk mengelompokkan komponen GUI. Program ini menggunakan beberapa JPanel, yaitu panel utama, panel judul, panel formulir, dan panel tombol. Penggunaan JPanel membantu menyusun komponen agar lebih terstruktur.

## 3. Atomic Component
**Class: JLabel, JTextField, JComboBox, JButton, dan JOptionPane**

Komponen yang digunakan meliputi:
- JLabel: Menampilkan judul dan keterangan setiap kolom.
- JTextField: Menerima masukan nama dan NIM mahasiswa.
- JComboBox: Menyediakan pilihan program studi.
- JButton: Menyediakan tombol untuk menyimpan data.
- JOptionPane: Menampilkan pesan peringatan dan hasil penyimpanan data.

## 4. Layout Classes
**Class: BorderLayout, FlowLayout, dan GridLayout**

Program menggunakan tiga jenis Layout Classes:
- BorderLayout: Mengatur posisi panel judul, formulir, dan tombol pada bagian utara, tengah, dan selatan.
- FlowLayout: Menyusun komponen secara berurutan pada panel judul dan tombol.
- GridLayout: Menyusun label dan kolom input dalam tiga baris dan dua kolom.

## 5. Event Listener
**Interface: ActionListener**

ActionListener digunakan untuk menangani tindakan pengguna ketika menekan tombol Simpan Data. Metode actionPerformed(ActionEvent e) di-override untuk mengambil data dari kolom input, memeriksa kelengkapan data, dan menampilkan hasil melalui JOptionPane.
Jika nama atau NIM belum diisi, program menampilkan pesan peringatan. Jika seluruh data telah diisi, program menampilkan notifikasi bahwa data berhasil disimpan beserta informasi mahasiswa.


## Screenshot Program

### Tampilan Formulir
![Tampilan Formulir](./Tampilan%20Formulir.png)

### Hasil Penyimpanan Data
![Hasil Penyimpanan](./Hasil%20disimpan.png)

### Validasi Input Kosong
![Validasi Input](./Validasi%20Input.png)


## Teknologi yang Digunakan
- Bahasa Pemrograman: Java
- GUI Library: Java Swing
- Code Editor: Visual Studio Code
- Version Control: GitHub
