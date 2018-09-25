/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author basisb08
 */
public class MainLomba {

    public static void main(String[] args) {
        Atlet[] daftarPeserta = {
            new Atlet("Hong Kong", "To Kenneth", 22.54),
            new Atlet("Singapore", "Teong", 22.59),
            new Atlet("China", "Yu Hexin", 22.11),
            new Atlet("Japan", "Nakamura", 22.20),
            new Atlet("Kazakhstan", "Mussin", 22.64),
            new Atlet("China", "Nakao", 22.46),
            new Atlet("Taipei", "Lin", 22.67),
            new Atlet("Indie", "Khade", 22.47),};

        System.out.println("=DATA LOMBA RENANG ASIAN GAMES GAYA BEBAS 50 METER PUTRA=");
        System.out.println("Negara         Nama                Waktu");
        System.out.println("----------------------------------------");
        for (int i = 0; i < daftarPeserta.length; i++) {
            System.out.printf("%-15s", daftarPeserta[i].getNegara());
            System.out.printf("%-20s", daftarPeserta[i].getNama());
            System.out.printf("%-25s", daftarPeserta[i].getWaktu());
            System.out.println("");
        }

        MainLomba sortObj = new MainLomba();

        //Cetak
        System.out.println("");
        System.out.println("=BUBBLE SORT ASCENDING=");
        System.out.println("Negara         Nama                Waktu");
        System.out.println("----------------------------------------");
        for (int i = 0; i < daftarPeserta.length; i++) {
            daftarPeserta = sortObj.bubbleSortAsc(daftarPeserta);
            System.out.printf("%-15s", daftarPeserta[i].getNegara());
            System.out.printf("%-20s", daftarPeserta[i].getNama());
            System.out.printf("%-25s", daftarPeserta[i].getWaktu());
            System.out.println("");
        }

        System.out.println("");
        System.out.println("=BUBBLE SORT DESCENDING=");
        System.out.println("Negara         Nama                Waktu");
        System.out.println("----------------------------------------");
        for (int i = 0; i < daftarPeserta.length; i++) {
            daftarPeserta = sortObj.bubbleSortDesc(daftarPeserta);
            System.out.printf("%-15s", daftarPeserta[i].getNegara());
            System.out.printf("%-20s", daftarPeserta[i].getNama());
            System.out.printf("%-25s", daftarPeserta[i].getWaktu());
            System.out.println("");
        }

        System.out.println("");
        System.out.println("=SELECTION SORT ASCENDING=");
        System.out.println("Negara         Nama                Waktu");
        System.out.println("----------------------------------------");
        for (int i = 0; i < daftarPeserta.length; i++) {
            daftarPeserta = sortObj.SelectionSortAsc(daftarPeserta);
            System.out.printf("%-15s", daftarPeserta[i].getNegara());
            System.out.printf("%-20s", daftarPeserta[i].getNama());
            System.out.printf("%-25s", daftarPeserta[i].getWaktu());
            System.out.println("");
        }

        System.out.println("");
        System.out.println("=SELECTION SORT DESCENDING=");
        System.out.println("Negara         Nama                Waktu");
        System.out.println("----------------------------------------");
        for (int i = 0; i < daftarPeserta.length; i++) {
            daftarPeserta = sortObj.SelectionSortDesc(daftarPeserta);
            System.out.printf("%-15s", daftarPeserta[i].getNegara());
            System.out.printf("%-20s", daftarPeserta[i].getNama());
            System.out.printf("%-25s", daftarPeserta[i].getWaktu());
            System.out.println("");
        }

        System.out.println("");
        System.out.println("=INSERTION SORT ASCENDING=");
        System.out.println("Negara         Nama                Waktu");
        System.out.println("----------------------------------------");
        for (int i = 0; i < daftarPeserta.length; i++) {
            daftarPeserta = sortObj.InsertionSortAsc(daftarPeserta);
            System.out.printf("%-15s", daftarPeserta[i].getNegara());
            System.out.printf("%-20s", daftarPeserta[i].getNama());
            System.out.printf("%-25s", daftarPeserta[i].getWaktu());
            System.out.println("");
        }

        System.out.println("");
        System.out.println("=INSERTION SORT DESCENDING=");
        System.out.println("Negara         Nama                Waktu");
        System.out.println("----------------------------------------");
        for (int i = 0; i < daftarPeserta.length; i++) {
            daftarPeserta = sortObj.InsertionSortDesc(daftarPeserta);
            System.out.printf("%-15s", daftarPeserta[i].getNegara());
            System.out.printf("%-20s", daftarPeserta[i].getNama());
            System.out.printf("%-25s", daftarPeserta[i].getWaktu());
            System.out.println("");
        }

    }

    public Atlet[] bubbleSortAsc(Atlet[] daftarPeserta) {
        boolean ulang = false;
        do {
            ulang = false;
            for (int j = 0; j < daftarPeserta.length - 1; j++) { //sekali jalan
                if (daftarPeserta[j].compareTo(daftarPeserta[j + 1]) > 0) { //compare to ini membandingkan dengan depannya, ketika compareTo maka mereturn -1, 0, atau 1
                    // apakah mhs kiri lebih besar dari kanan, jika iya tukar (>0), syarat logika karena compareTo returnnya integer
                    daftarPeserta = swap(daftarPeserta, j, j + 1);
                    ulang = true; //untuk mengulang lagi dari awal karena for hanya sekali jalan, satu iterasi
                    //sudah ketemu false maka berhenti, sampai array urut baru false
                }
            }
        } while (ulang);
        return daftarPeserta;
    }

    public Atlet[] bubbleSortDesc(Atlet[] daftarPeserta) {
        boolean ulang = false;
        do {
            ulang = false;
            for (int j = 0; j < daftarPeserta.length - 1; j++) { //sekali jalan
                if (daftarPeserta[j].compareTo(daftarPeserta[j + 1]) < 0) { //compare to ini membandingkan dengan depannya, ketika compareTo maka mereturn -1, 0, atau 1
                    // apakah mhs kiri lebih besar dari kanan, jika iya tukar (>0), syarat logika karena compareTo returnnya integer
                    daftarPeserta = swap(daftarPeserta, j, j + 1);
                    ulang = true; //untuk mengulang lagi dari awal karena for hanya sekali jalan, satu iterasi
                    //sudah ketemu false maka berhenti, sampai array urut baru false
                }
            }
        } while (ulang);
        return daftarPeserta;
    }

    public Atlet[] SelectionSortAsc(Atlet[] daftarPeserta) {
        for (int i = 0; i < daftarPeserta.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < daftarPeserta.length; j++) {
                if (daftarPeserta[j].compareTo(daftarPeserta[min]) < 0) {
                    min = j;
                }
            }
            swap(daftarPeserta, i, min);
        }
        return daftarPeserta;
    }

    public Atlet[] SelectionSortDesc(Atlet[] daftarPeserta) {
        for (int i = 0; i < daftarPeserta.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < daftarPeserta.length; j++) {
                if (daftarPeserta[j].compareTo(daftarPeserta[min]) > 0) {
                    min = j;
                }
            }
            swap(daftarPeserta, i, min);
        }
        return daftarPeserta;
    }

    public Atlet[] swap(Atlet[] daftarPeserta, int idx1, int idx2) {
        Atlet temp = daftarPeserta[idx1];
// daftar index 1, ditaruh di temporary, tipe tampungan harus sama
        daftarPeserta[idx1] = daftarPeserta[idx2];
        // daftarmhs index 1 dimasukkan nilai dari idx2
        daftarPeserta[idx2] = temp;
        // daftarmhs index 2 dimasukkan nilai dari temporary(pasti sudah berubah)
        return daftarPeserta;
    }

    public Atlet[] InsertionSortAsc(Atlet[] daftarPeserta) {
        for (int i = 1; i < daftarPeserta.length; i++) {
            Atlet point = daftarPeserta[i];
            int j = i - 1;
            while ((j > -1) && (daftarPeserta[j].compareTo(point) > 0)) {
                daftarPeserta[j + 1] = daftarPeserta[j];
                j--;
            }
            daftarPeserta[j + 1] = point;
        }
        return daftarPeserta;
    }

    public Atlet[] InsertionSortDesc(Atlet[] daftarPeserta) {
        for (int i = 1; i < daftarPeserta.length; i++) {
            Atlet pointer = daftarPeserta[i];
            int j = i - 1;
            while ((j > -1) && (daftarPeserta[j].compareTo(pointer) < 0)) {
                daftarPeserta[j + 1] = daftarPeserta[j];
                j--;
            }
            daftarPeserta[j + 1] = pointer;
        }
        return daftarPeserta;
    }

}
