/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A.model;

/**
 *
 * @author AyUmiYuNo1
 */
public class Nasabah {
    private String kode;
    private String nama;
   

    public Nasabah() {
    }

    public Nasabah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
       
    }

    public String getKode(){
        return kode;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
}
