package com.penjumlahan;


import javax.jws.soap.SOAPMessageHandlers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // a operator b
        Scanner inputUser;
        float a, b, hasil;
//        String operator ;
        String defaultTam = "ditambah atau +";
        String defaultKur = "dikurangi atau -";
        String defaultKal = "dikali atau *";
        String defaultBag = "dibagi atau / :";

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        String operator = inputUser.next();
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input user = " + a + " " + operator + " " + b);


        // Operasi penjumlahan
        if (defaultTam.contains(operator)) {
            hasil = a + b;
            System.out.println("Hasilnya adalah = " + hasil);

         // Operasi pengurangan
        } else if (defaultKur.contains(operator)) {
            hasil = a - b;
            System.out.println("Hasilnya adalah = " + hasil);

        // Operasi perkalian
        } else if (defaultKal.contains(operator)) {
            hasil = a * b;
            System.out.println("Hasilnya adalah = " + hasil);

        // Operasi pembagian
        } else if (defaultBag.contains(operator)) {
            hasil = a / b;
            System.out.println("Hasilnya adalah = " + hasil);
        } else {
            System.out.println("Operasi yang anda gunakan salah");
        }


//        // a operator b
//        Scanner inputUser;
//        float a,b,hasil;
//        String operator;
//
//        inputUser = new Scanner(System.in);
//
//        System.out.print("Nilai a = ");
//        a = inputUser.nextFloat();
//        System.out.print("Operator = ");
//        operator = inputUser.next();
//        System.out.print("Nilai b = ");
//        b = inputUser.nextFloat();
//
//        System.out.println("Input user = " + a + " " + operator + " " + b);
//
//        //Operator penjumlahan
//        if (operator.equals("tambah") || operator.charAt(0) == '+') {
//            hasil = a + b;
//            System.out.println("Hasilnya adalah = " + hasil);
//
//        // Operator pengurangan
//        } else if (operator.equals("dikurangi") || operator.charAt(0) == '-') {
//            hasil = a - b;
//            System.out.println("Hasilnya adalah = " + hasil);
//
//        // Operator perkalian
//        } else if (operator.equals("dikali") || operator.charAt(0) == '*') {
//            hasil = a * b;
//            System.out.println("Hasilnya adalah = " + hasil);
//
//        // Operator pembagian
//        } else if (operator.equals("dibagi") || operator.charAt(0) == '/') {
//            hasil = a / b;
//            System.out.println("Hasilnya adalah = " + hasil);
//        } else {
//            System.out.println("Operator tidak di temukan, harap coba kembali.");
//        }
    }
}

