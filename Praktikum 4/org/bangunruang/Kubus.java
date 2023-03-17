/*
 * Copyright (c) 2023.
 * Risang Baskoro
 * 24060119130119
 * B1
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus extends BujurSangkar {
    private BujurSangkar permukaan;

    public Kubus(double panjangSisi) {
        super(panjangSisi);
        this.permukaan = new BujurSangkar(panjangSisi);
    }

    public double getVolume() {
        return this.getPanjangSisi() * this.getPanjangSisi() * this.getPanjangSisi();
    }

    public double getLuasAlas() {
        return this.permukaan.getLuas();
    }
}