/*
 * Copyright (c) 2023.
 * Risang Baskoro
 * 24060119130119
 * B1
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        pp.printInfo();
        System.out.println("Luas Persegi Panjang: " + pp.getLuas());
    }
}