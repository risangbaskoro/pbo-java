/*
 * Copyright (c) 2023.
 * Risang Baskoro
 * 24060119130119
 * B1
 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = 4;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void printInfo() {
        System.out.println("Bangun Persegi Panjanq bersisi "+this.getJumlahSisi());
    }
}