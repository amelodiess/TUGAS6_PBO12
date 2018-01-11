/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.amelia.latihanmvcjdbc.event;

import edu.amelia.latihanmvcjdbc.entity.Pelanggan;
import edu.amelia.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Amelia
 * NIM : 10116542
 * NAMA : PUTRI AYU AMELIA
 * KELAS : PBO-12
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
