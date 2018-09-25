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
public class Atlet implements Comparable {

    private String negara, nama;
    private double waktu;

    public Atlet(String negara, String nama, double waktu) {
        this.negara = negara;
        this.nama = nama;
        this.waktu = waktu;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getWaktu() {
        return waktu;
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
    }

    @Override
    public int compareTo(Object o) {
        Atlet lomba = (Atlet) o;
        if (this.getWaktu() < lomba.getWaktu()) {
            return -1; //return -1 ketika 2 object dibandingkan lebih kecil yang di depan 
        } else if (this.getWaktu() > lomba.getWaktu()) {
            return 1; //return 1 ketika 2 object dibandingkan lebih besar yang di depan
        } else {
            return 0; //return 0 ketika 2 object dibandingkan di depan sama dengan yang di belakang
        }
    }
}
