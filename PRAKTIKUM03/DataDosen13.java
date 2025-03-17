package PRAKTIKUM03;

public class DataDosen13 {
    public void dataSemuaDosen(Dosen13[] arrayOfDosen){
        System.out.println("======== Data Semua Dosen ========");
       for (int index = 0; index < arrayOfDosen.length; index++) {
            System.out.println("Kode            : "+ arrayOfDosen[index].kode);
            System.out.println("Nama            : "+ arrayOfDosen[index].nama);
            System.out.println("Jenis Kelamin   : "+ (arrayOfDosen[index].jenisKelamin? "Pria" : "Wanita"));
            System.out.println("Usia            : "+ arrayOfDosen[index].usia);
            System.out.println("---------------------------------");
       }
    }
    public void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen){
        int jmlPria = 0;
        int jmlWanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                jmlPria ++;
            } else {
                jmlWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " +jmlPria);
        System.out.println("Jumlah Dosen Wanita : "+jmlWanita);
    }
    public void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen){
        int totalUsiaPria = 0;
        int jmlPria = 0;
        int totalUsiaWanita = 0;
        int jmlWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalUsiaPria += arrayOfDosen[i].usia;
                jmlPria++;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
                jmlWanita++;
            }
        }
        double rataPria = totalUsiaPria/jmlPria;
        double rataWanita = totalUsiaWanita/jmlWanita;
        
        System.out.println("Rata-rata Usia Dosen Pria: " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + rataWanita);
    }
    public void infoDosenPalingTua(Dosen13[]arrayOfDosen){
        Dosen13 dosenTertua = arrayOfDosen[0];
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("Data Dosen Paling Tua:");
        System.out.println("Kode          : " + dosenTertua.kode);
        System.out.println("Nama          : " + dosenTertua.nama);
        System.out.println("Jenis kelamin : " + (dosenTertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + dosenTertua.usia);
    }
    public void infoDosenPalingMuda(Dosen13[]arrayOfDosen){
        Dosen13 dosenTermuda = arrayOfDosen[0];
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("Data Dosen Paling Muda:");
        System.out.println("Kode          : " + dosenTermuda.kode);
        System.out.println("Nama          : " + dosenTermuda.nama);
        System.out.println("Jenis kelamin : " + (dosenTermuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + dosenTermuda.usia);
    }
}
