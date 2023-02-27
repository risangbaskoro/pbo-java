/*
 * Copyright (c) 2023.
 * Risang Baskoro
 */

public class Mtitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(1,2);
        Titik t2 = new Titik(3,4);

        System.out.println("Jumlah objek titik : "+ Titik.counterTitik);
        System.out.println("t1("+t1.getAbsis()+", "+t1.getOrdinat()+")");
        System.out.println("t2("+t2.getAbsis()+", "+t2.getOrdinat()+")");
    }
}