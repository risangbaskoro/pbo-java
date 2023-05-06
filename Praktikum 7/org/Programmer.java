/**
 * Risang Tri Baskoro
 * 24060119130119
 * 2023
 */

package org;

public class Programmer extends Pegawai {
    int bonus = 450000;

    public Programmer(String nama){
        super();
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }
}
