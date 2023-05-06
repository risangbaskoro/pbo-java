/**
 * Risang Tri Baskoro
 * 24060119130119
 * 2023
 */

package org;

public class Manajer extends Pegawai {
    int tunjangan = 700000;

    public Manajer(String nama){
        super();
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
