/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_A.model;

/**
 *
 * @author LABMM07
 */
public class Peminjaman {
    private String kode;
    private String nasabah;
    private String tglpinjam;
    private String jumlahpinjaman;
    private String lamapinjaman;
    private String bunga;

    public Peminjaman() {
    }

    public Peminjaman(String kode, String nasabah, String tglpinjam, String jumlahpinjaman, String lamapinjaman, String bunga) {
        this.kode = kode;
        this.nasabah = nasabah;
        this.tglpinjam = tglpinjam;
        this.jumlahpinjaman = jumlahpinjaman;
        this.lamapinjaman = lamapinjaman;
        this.bunga = bunga;
    }


    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    
    public String getNasabah() {
        return nasabah;
    }

    public void setNasabah(String nasabah) {
        this.nasabah = nasabah;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getJumlahpinjaman() {
        return jumlahpinjaman;
    }

    public void setJumlahpinjaman(String jumlahpinjaman) {
        this.jumlahpinjaman = jumlahpinjaman;
    }
     public String getLamapinjaman() {
        return jumlahpinjaman;
    }

    public void setLamapinjaman(String lamapinjaman) {
        this.lamapinjaman = lamapinjaman;
    }
     public String getBunga() {
        return lamapinjaman;
    }

    public void setBunga(String bunga) {
        this.bunga = bunga;
    }
    
}
