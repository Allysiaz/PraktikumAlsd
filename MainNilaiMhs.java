public class MainNilaiMhs {
    public static void main(String[] args) {
        int nilaiUTS[] = {78, 85, 90, 76, 92, 88, 80, 82};
        int nilaiUAS[] = {82, 88, 87, 79, 95, 85, 83, 84};

        NilaiMhs mhs = new NilaiMhs(nilaiUTS, nilaiUAS);

        int tertinggi = mhs.utsTertinggi(0, nilaiUTS.length-1);
        System.out.println("Niali UTS tertinggi: " + tertinggi);

        int terendah = mhs.utsTerendah(0, nilaiUTS.length-1);
        System.out.println("Nilai UTS terendah: " + terendah);

        double rataRataUAS = mhs.hitungRataUAS();
        System.out.println("Rata-rata nilai UAS: " + rataRataUAS);
    }
}
