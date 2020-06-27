package com.demo;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {

        // Deklarasi variable dan scanner
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scanner = new Scanner(System.in);

        // Mengambil input
        System.out.print("Apakah ada kartu member : ");
        kartu = scanner.nextLine();
        System.out.print("Total belanja           : ");
        belanjaan = scanner.nextInt();

        // Proses
        if (kartu.equalsIgnoreCase("iya")){
            if (belanjaan > 500000){
                diskon = 50000;
            }else if (belanjaan > 100000){
                diskon =15000;
            }else {
                diskon = 0;
            }
        } else {
            if (belanjaan > 100000){
                diskon = 10000;
            }else {
                diskon = 0;
            }
        }
        // total yang harus di bayar
        bayar = belanjaan - diskon;

        // output
        System.out.println("Total bayar             : Rp " + bayar);
    }
}
