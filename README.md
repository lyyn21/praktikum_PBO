# Praktikum Pemrograman Berorientasi Objek (PBO)

Repositori ini adalah tempat pengumpulan tugas dan laporan praktikum Pemrograman Berorientasi Objek (PBO) berbasis Java.

## Identitas Praktikan
Silakan ganti teks di dalam kurung siku dengan identitas Anda:
- **Nama Lengkap:** Aditya Dwi Aryanto
- **NIM:** 103132400027

## Struktur Direktori

Repositori ini disusun berdasarkan modul praktikum (Modul 1 hingga Modul 15). Secara umum, struktur folder di dalam setiap modul adalah sebagai berikut:

```text
├── modul-01-running-modul/
│   ├── docs/
│   └── project/
├── modul-02-intro/
│   ├── docs/
│   └── project/
...
```

- **`docs/`**: Digunakan untuk menyimpan file Laporan Praktikum (PDF), dokumentasi tugas, atau *screenshot* hasil eksekusi program.
- **`project/`**: Digunakan sebagai direktori *Project Apache NetBeans* yang memuat seluruh *source code* (`.java`) dari modul yang bersangkutan.

## Panduan Pengerjaan di Apache NetBeans

### 1. Membuat/Membuka Project
Karena setiap modul memiliki tugasnya masing-masing, jadikan folder `project/` pada setiap modul sebagai satu buah **Java Application Project** di NetBeans.
- **Cara Membuat Project Baru:**
  1. Buka NetBeans, pilih **File** > **New Project** > **Java with Maven** > **Java Application**.
  2. Klik Next.
  3. Pada **Project Name**, isi sesuai modul (misal: `Modul01`).
  4. Pada **Project Location**, arahkan (*Browse*) tepat ke dalam folder modul yang sedang Anda kerjakan (contoh: `modul-01-running-modul/`).
  5. Pastikan folder kode utama (*Source Packages*) Anda ter-generate di dalam subfolder `project/`.

### 2. Struktur Package `guided` dan `unguided`
Untuk mempermudah asisten praktikum saat mengoreksi, dan memisahkan antara latihan dengan tugas mandiri, susunlah *package* di dalam project Java Anda menjadi dua:
- `guided`: Untuk menyimpan *source code* latihan terbimbing (yang sudah dicontohkan di dalam modul).
- `unguided`: Untuk menyimpan *source code* tugas mandiri / responsi (yang dikerjakan sendiri sebagai tugas).

### 3. Menjalankan File Secara Terpisah (Single File Run)
Di NetBeans, dalam satu *project* seringkali terdapat banyak file yang memiliki *method* `public static void main(String[] args)`.
- Jangan menggunakan tombol Run Project hijau (`F6`), karena NetBeans akan mengeksekusi kelas utama (*Main Class*) bawaan *project* secara *default*.
- **Gunakan Shortcut `Shift + F6` (Run File)**: Klik kanan pada area *source code* (file yang sedang Anda buka) lalu pilih **Run File**, atau cukup tekan `Shift + F6`. Hanya kode pada file tersebut yang akan dieksekusi.

### 4. Trik Cepat Koding di NetBeans
Gunakan kombinasi tombol (*shortcut*) berikut untuk mempercepat proses pembuatan kode:
- `Alt + Shift + F`: **Auto Format**, merapikan indentasi baris kode secara otomatis.
- `Alt + Insert`: **Code Generator**, memunculkan menu untuk membuat *Constructor*, *Getter/Setter*, *Override Method*, dll secara otomatis.
- `Ctrl + Shift + I`: **Fix Imports**, menambahkan deklarasi `import` yang kurang atau menghapus yang tidak digunakan secara otomatis.

## Panduan Pengumpulan Laporan
1. Gunakan file `Template Laporan Praktikum PBO Sains Data.docx` yang telah disediakan di direktori utama repositori ini sebagai format dasar laporan Anda.
2. Setelah laporan selesai disusun, simpan (*export*) dokumen tersebut ke dalam format **PDF**.
3. Letakkan file PDF tersebut ke dalam folder `docs/` pada modul yang bersangkutan.
4. **Wajib** menggunakan format penamaan file berikut: `Modul[nomor modul]_[NIM]_[Nama lengkap].pdf` (contoh: `Modul01_103112400148_JohnDoe.pdf`).

## Panduan Alur Git (Commit & Push)
Setelah Anda menyelesaikan satu modul praktikum (laporan dan *source code*), ikuti alur Git berikut untuk menyimpan pekerjaan Anda ke repositori GitHub:

1. Buka Terminal/Command Prompt/Git Bash, pastikan Anda berada di direktori *root* repositori ini.
2. Cek status perubahan file:
   ```bash
   git status
   ```
3. Tambahkan seluruh perubahan ke *staging area*:
   ```bash
   git add .
   ```
4. Buat *commit* dengan pesan yang deskriptif dan rapi:
   ```bash
   git commit -m "feat: menyelesaikan modul 01 running modul"
   ```
   *(Tips: Gunakan awalan yang jelas, contoh: `feat:` untuk penambahan *source code* baru, `docs:` untuk penambahan/revisi laporan, `fix:` untuk perbaikan bug).*
5. *Push* pekerjaan Anda ke GitHub:
   ```bash
   git push origin main
   ```
*(Catatan: Pesan peringatan `LF will be replaced by CRLF` yang mungkin muncul saat proses `git add` pada Windows adalah hal yang wajar dan aman untuk diabaikan).*
