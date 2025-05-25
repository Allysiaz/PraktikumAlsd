public class Mahasiswa13 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa13() {

    }
    public Mahasiswa13(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    void tampilInformasi(){
        System.out.println(nim + "\t" + nama +"\t"+ kelas +"\t"+ ipk );
    }
}