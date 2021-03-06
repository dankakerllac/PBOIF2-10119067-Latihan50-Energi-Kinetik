/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan50.energi.kinetik;

/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago P.I
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi: Energi Kinetik
 */
public class Bola {
    private double massa,kecepatan,kecepatanAwal;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getKecepatanAwal() {
        return kecepatanAwal;
    }

    public void setKecepatanAwal(double kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }
    
    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * (kecepatan * kecepatan); 
    }
    
    public double hitungUsaha (double massa,double kecepatanAwal, double kecepatanAkhir) {
        return 0.5 * massa * ((kecepatanAkhir * kecepatanAkhir) - (kecepatanAwal * kecepatanAwal));
    }
}
