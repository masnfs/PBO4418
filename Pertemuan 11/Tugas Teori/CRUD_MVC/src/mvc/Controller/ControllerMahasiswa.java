/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOMahasiswa;
import mvc.DAOInterface.IMahasiswa;
import mvc.Model.Mahasiswa;
import mvc.Model.TabelModelMahasiswa;
import mvc.View.FormMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ncy
 */
public class ControllerMahasiswa {
    FormMahasiswa frame;
    IMahasiswa impIMahasiswa;
    List<Mahasiswa> lb;
    
    public ControllerMahasiswa(FormMahasiswa frame){
        this.frame = frame;
        impIMahasiswa = new DAOMahasiswa();
        lb = impIMahasiswa.getAll();
    }
    
    public void reset(){
        frame.getTxtID().setText("");
        frame.getTxtNim().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
    }
    
    public void isiTable(){
        lb = impIMahasiswa.getAll();
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row){
        frame.getTxtID().setText(lb.get(row).getId().toString());
        frame.getTxtNim().setText(lb.get(row).getNim());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
    }
    
    public void insert(){
        if (!frame.getTxtNim().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()){
            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            impIMahasiswa.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    
    public void update(){
        if (!frame.getTxtID().getText().trim().isEmpty()){
            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            impIMahasiswa.insert(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan di ubah");
        }
    }
    
    public void delete(){
        if (!frame.getTxtID().getText().trim().isEmpty()){
            int id = Integer.parseInt(frame.getTxtID().getText());
            impIMahasiswa.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan di ubah");
        }
    }
    
    public void isiTableCariNama(){
        lb = impIMahasiswa.getCariNama(frame.getTxtCariNama().getText());
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void carinama(){
        if (!frame.getTxtCariNama().getText().trim().isEmpty()){
            impIMahasiswa.getCariNama(frame.getTxtCariNama().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
}
