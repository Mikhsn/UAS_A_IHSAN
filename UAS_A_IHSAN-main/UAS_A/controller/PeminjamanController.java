/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A.controller;

import UAS_A.model.*;
import UAS_A.view.FormPeminjaman;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LABMM07
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private NasabahDao nasabahDao;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;

    public PeminjamanController(FormPeminjaman formPeminjaman) {
        this.formPeminjaman = formPeminjaman;
       nasabahDao = new NasabahDaoImpl();
        peminjamanDao = new PeminjamandDaoImpl();
    }   
    
    public void bersihForm(){
        formPeminjaman.getTxtTglPinjam().setText("");
       
    }
    
    public void setCboNobp(){
        formPeminjaman.getCboKode().removeAllItems();
        List<Nasabah> list = nasabahDao.getAll();
        list.forEach((nasabah) -> {
            formPeminjaman.getCboKode().
                    addItem(nasabah.getKode()+"-"+nasabah.getNama());
        });
    }
   
    
    public void save(){
        peminjaman = new Peminjaman();
        peminjaman.setKode(formPeminjaman.getCboKode()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Ok");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            List<Nasabah> listNasabah = nasabahDao.getAll();
            for(Nasabah nasabah:listNasabah){
                if(peminjaman.getKode()==nasabah.getKode()){
                    formPeminjaman.getCboKode()
                    .setSelectedItem(nasabah.getKode()+"-"+nasabah.getNama());
                    break;
                }
            }
           
            formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglpinjam());
           
        }
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
            (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getKode(),
                peminjaman.getNasabah(),
                peminjaman.getTglpinjam(),
                peminjaman.getJumlahpinjaman(),
                peminjaman.getLamapinjaman(),
                peminjaman.getBunga()
                      private String kode;
   peminjaman nasabah;
    private String tglpinjam;
    private String jumlahpinjaman;
    private String lamapinjaman;
    private String bunga;
            };
            tabelModel.addRow(data); 
        }
    }
}
