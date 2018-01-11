/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.amelia.latihanmvcjdbc.main;

import edu.amelia.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.amelia.latihanmvcjdbc.entity.Pelanggan;
import edu.amelia.latihanmvcjdbc.error.PelangganException;
import edu.amelia.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Amelia
 * NIM : 10116542
 * NAMA : PUTRI AYU AMELIA
 * KELAS : PBO-12
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        PelangganDao dao = KingBarbershopDatabase.getPelangganDao();        
       
        dao.deletePelanggan(1);
        
        }
        
    }
    

