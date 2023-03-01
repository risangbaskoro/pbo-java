/*
 * Copyright (c) 2023.
 * Risang Baskoro
 * 24060119130119
 * B1
 */

public class Titik {

    private double absis;
    private double ordinat;

    public static int counterTitik = 0;

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public int getCounterTitik() {
        return counterTitik;
    }
}