package PRAKTIKUM07;
import java.util.Arrays;
public class DataDosen13 {
    Dosen13[] dataDosen;
    int idx;

    DataDosen13() {
        dataDosen = new Dosen13[5];
        idx = 0;
    }

    void tambah(Dosen13 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen13 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen13 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen13 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    public void PencarianDataSequential13(String namaCari) {
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(namaCari)) {
                System.out.println("Data dosen ditemukan pada indeks ke-" + i + ":");
                dataDosen[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama '" + namaCari + "' Tidak Ditemukan.");
        }
    }

    public void PencarianDataBinary13(int usiaCari) {
        Arrays.sort(dataDosen, 0, idx, (d1, d2) -> d1.usia - d2.usia);
        int left = 0;
        int right = idx - 1;
        int hasil = -1;
        int jumlahHasil = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataDosen[mid].usia == usiaCari) {
                hasil = mid;
                break;
            } else if (dataDosen[mid].usia < usiaCari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (hasil != -1) {
            for (int i = 0; i < idx; i++) {
                if (dataDosen[i].usia == usiaCari) {
                    jumlahHasil++;
                }
            }
            if (jumlahHasil > 1) {
                System.out.println("PERINGATAN: Ditemukan lebih dari 1 dosen dengan usia " + usiaCari + ".");
            }
            System.out.println("Data dosen dengan usia " + usiaCari + " ditemukan:");
            for (int i = 0; i < idx; i++) {
                if (dataDosen[i].usia == usiaCari) {
                    dataDosen[i].tampil();
                }
            }
        } else {
            System.out.println("Data dosen dengan usia " + usiaCari + " tidak ditemukan.");
        }
    }
}
