public class NilaiMhs {
    int nilaiUTS [];
    int nilaiUAS [];

    public NilaiMhs(int nilaiUTS[], int nilaiUAS[]){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int tertinggi (int a, int b){
        return (a > b)? a : b;
    }
    int utsTertinggi(int a, int b){
        if (a == b){
            return nilaiUTS[a];
        }
    
        int total = (a + b) / 2;
        int tinggiA = utsTertinggi(a, total);
        int tinggiB = utsTertinggi(total + 1, b);

        return tertinggi(tinggiA, tinggiB);
    }
    int terendah (int a, int b){
        return (a < b)? a : b;
    }
    int utsTerendah(int a, int b){
        if (a == b){
            return nilaiUTS[b];
        }

        int total = (a + b) / 2;
        int rendahA = utsTerendah(a, total);
        int rendahB = utsTerendah(total + 1, b);

        return terendah (rendahA, rendahB);
    }

    double hitungRataUAS(){
        int total = 0;

        for (int i = 0; i < nilaiUAS.length; i++) {
            total += nilaiUAS[i];
        }

        return (double) total / nilaiUAS.length;
    }
}
