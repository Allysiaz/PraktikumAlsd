package TUGAS;

public class Mahasiswa {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa() {

    }
    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    void tampilInformasi(){
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
    }
}
