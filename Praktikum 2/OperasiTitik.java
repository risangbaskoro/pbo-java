/*
 * Copyright (c) 2023.
 * Risang Baskoro
 * 24060119130119
 * B1
 */

public class OperasiTitik {
    public void refleksiSumbuX(Titik titik) {
        Double ordinat = titik.getOrdinat();
        titik.setOrdinat(-1 * ordinat);
    }

    public void refleksiSumbuY(Titik titik) {
        Double absis = titik.getAbsis();
        titik.setAbsis(-1 * absis);
    }

    public Titik refleksiX(Titik titik) {
        Titik refleksi = new Titik(titik.getAbsis(), titik.getOrdinat());
        this.refleksiSumbuX(refleksi);

        return refleksi;
    }

    public Titik refleksiY(Titik titik) {
        Titik refleksi = new Titik(titik.getAbsis(), titik.getOrdinat());
        this.refleksiSumbuY(refleksi);

        return refleksi;
    }
}