package org.main;

import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        Kubus cube = new Kubus(12);

        System.out.println("Volume: " + cube.getVolume());
        System.out.println("Luas Alas: " + cube.getLuasAlas());
    }
}