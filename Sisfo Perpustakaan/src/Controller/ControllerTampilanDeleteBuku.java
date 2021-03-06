/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import database.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AnggotaModel;
import model.BukuModel;
import sisfo.perpustakaan.Anggota;
import sisfo.perpustakaan.Buku;
import view.TampilanDeleteAnggota;
import view.TampilanDeleteBuku;

/**
 *
 * @author rizky
 */
public class ControllerTampilanDeleteBuku implements ActionListener{
    private BukuModel model;
    private TampilanDeleteBuku  view;
    private Buku b;
    
    public ControllerTampilanDeleteBuku(BukuModel model, Buku b){
        
        this.model = model;
        view = new TampilanDeleteBuku();
        view.setVisible(true);
        view.getBtnBack().addActionListener(this);
        view.getBtnDelete().addActionListener(this);
        this.b = b;        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        database db = new database();
        Object source = ae.getSource();
        
        if (source.equals(view.getBtnBack())){
            ControllerDaftarAnggota cd = new ControllerDaftarAnggota();
            
        }
        else if (source.equals(view.getBtnDelete())){
            try {
                model.deleteBuku();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerAnggotaAdd.class.getName()).log(Level.SEVERE, null, ex);
            }
            ControllerDaftarAnggota cd = new ControllerDaftarAnggota();
            
            
        }
        else if (source.equals(view.getBtnDelete())){
            ControllerLogoutPetugas clp = new ControllerLogoutPetugas();
        }
    }
}
