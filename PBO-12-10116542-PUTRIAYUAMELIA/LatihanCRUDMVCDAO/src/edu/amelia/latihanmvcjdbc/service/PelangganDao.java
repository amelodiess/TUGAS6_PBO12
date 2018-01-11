/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.amelia.latihanmvcjdbc.service;

import edu.amelia.latihanmvcjdbc.entity.Pelanggan;
import edu.amelia.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author Amelia
 * NIM : 10116542
 * NAMA : PUTRI AYU AMELIA
 * KELAS : PBO-12
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
   
    
    
}
