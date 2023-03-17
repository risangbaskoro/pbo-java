/*
 * Copyright (c) 2023.
 *  Risang Baskoro
 *  24060119130119
 *  B1
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
        jumlahSisi = 4;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }

    public double getLuas() {
        return panjangSisi * panjangSisi;
    }

    public double getKeliling() {
        return 4 * panjangSisi;
    }

    public void printInfo() {
        System.out.println("Bangun Bujur Sangkar bersisi " + this.getJumlahSisi());
    }
}