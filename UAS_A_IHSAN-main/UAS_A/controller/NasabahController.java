/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A.controller;
import UAS_A.view.FormNasabah;
import UAS_A.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author AyUmiYuNo1
 */
public class NasabahController {
     private FormNasabah formNasabah;
    private NasabahDao nasabahDao;
    private Nasabah nasabah;
    
    public NasabahController(FormNasabah formNasabah){
        this.formNasabah = formNasabah;
        nasabahDao = new NasabahDaoImpl();
    }
    
    public void bersihForm(){
        formNasabah.getTxtKode().setText("");
        formNasabah.getTxtNama().setText("");
       
    }
    
    public void saveNasabah(){
        nasabah = new Nasabah();
        nasabah.setKode(formNasabah.getTxtKode().getText());
        nasabah.setNama(formNasabah.getTxtNama().getText());
        nasabahDao.save(nasabah);
        javax.swing.JOptionPane.showMessageDialog(formNasabah, "Entri Ok");
    }
    
    public void getNasabah(){
        int index = formNasabah.getTblNasabah().getSelectedRow();
        nasabah = nasabahDao.getNasabah(index);
        if(nasabah != null){
            formNasabah.getTxtKode().setText(nasabah.getNobp());
            formNasabah.getTxtNama().setText(nasabah.getNama());
           
        }
    }
    
    public void updateNasabah(){
        int index = formNasabah.getTblNasabah().getSelectedRow();
        nasabah.setKode(formNasabah.getTxtKode().getText());
       nasabah.setNama(formNasabah.getTxtNama().getText());
       
        nasabahDao.update(index, nasabah);
        javax.swing.JOptionPane.showMessageDialog(formNasabah, "Update Ok");
    }
    
    public void deleteNasabah(){
        int index = formNasabah.getTblNasabah().getSelectedRow();
        nasabahDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formNasabah, "Delete Ok");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
               (DefaultTableModel) formNasabah.getTblNasabah().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Nasabah> list = nasabahDao.getAll();
        for(Nasabah nasanbah : list){
            Object[] data = {
                nasanbah.getKode(),
                nasanbah.getNama()
               
            };
            tabelModel.addRow(data); 
        }
    }
}
