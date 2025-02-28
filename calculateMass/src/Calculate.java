/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Calculate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_pilihan;
        do {
            System.out.println("==============");
            System.out.println("KONVERSI MASSA");
            System.out.println("==============");
            System.out.println("(1) KG to HG");
            System.out.println("(2) KG to DAG");
            System.out.println("(3) KG to G");
            System.out.println("(4) KG to DG");
            System.out.println("(5) KG to CG");
            System.out.println("(6) KG to MG");
            System.out.println("(0) Exit");
            System.out.print("Input Pilihan: ");
            input_pilihan = input.nextInt();

            if (input_pilihan == 1) {
                System.out.print("Masukkan angka");
                int input_angka = input.nextInt();
                float hasil = input_angka * 10;
                System.out.println("hasil dari konversi massa tersebut adalah " + hasil);
            } else if (input_pilihan == 2) {
                System.out.print("Masukkan angka");
                int input_angka = input.nextInt();
                float hasil = input_angka * 100;
                System.out.println("hasil dari konversi massa tersebut adalah " + hasil);
            } else if (input_pilihan == 3) {
                System.out.print("Masukkan angka");
                int input_angka = input.nextInt();
                float hasil = input_angka * 1000;
                System.out.println("hasil dari konversi massa tersebut adalah " + hasil);
            } else if (input_pilihan == 4) {
                System.out.print("Masukkan angka");
                int input_angka = input.nextInt();
                float hasil = input_angka * 10000;
                System.out.println("hasil dari konversi massa tersebut adalah " + hasil);
            } else if (input_pilihan == 5) {
                System.out.print("Masukkan angka");
                int input_angka = input.nextInt();
                float hasil = input_angka * 100000;
                System.out.println("hasil dari konversi massa tersebut adalah " + hasil);
            } else if (input_pilihan == 6) {
                System.out.print("Masukkan angka");
                int input_angka = input.nextInt();
                float hasil = input_angka * 1000000;
                System.out.println("hasil dari konversi massa tersebut adalah " + hasil);
            } else if(input_pilihan == 0) {
                System.out.println("Program Selesai");
            } else {
                System.out.println("pilihan tidak valid");
            }

        } while (input_pilihan != 0);
            input.close();
    }
}
