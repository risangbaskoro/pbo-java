/*
 * Copyright (c) 2023.
 * Risang Baskoro
 * 24060119130119
 * B1
 */

public class MOperasiTitik {
    public static void main(String[] args) {
        Titik titik = new Titik(4.0, 4.0);
        System.out.println("Titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");

        OperasiTitik op = new OperasiTitik();
        op.refleksiSumbuX(titik);
        System.out.println("titik setelah refleksi sb X: titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
        op.refleksiSumbuY(titik);
        System.out.println("titik setelah refleksi sb Y: titik(" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
    }
}