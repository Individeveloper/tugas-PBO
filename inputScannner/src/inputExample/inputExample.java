/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputExample;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */

public class inputExample {
    public static void main(String[] args) {
    
        Scanner masukkan = new Scanner(System.in);
        int input_pilihan;
        do {
            System.out.println("Program Konversi Suhu");
            System.out.println("======================");
            System.out.println("1. Celcius-Fahrenheit");
            System.out.println("2. Celcius-Kelvin");
            System.out.println("3. Celcius-Reamur");
            System.out.println("4. Exit");
            System.out.println("======================");
        
            System.out.print("Input Pilihan: ");
            input_pilihan = masukkan.nextInt();
        
        
            switch (input_pilihan) {
                case 1 ->{
                    System.out.print("Masukkan suhu dalam celcius: ");
                    float suhu = masukkan.nextInt();
                    float fahren = (9/5*suhu)+32;
                    System.out.println(fahren+"F");
                } 
                case 2 -> {
                    float suhu = masukkan.nextInt();
                    float kelvin = (float)(273.15 + suhu);
                    System.out.println(kelvin+"K");
                }
                case 3 -> {
                    float suhu = masukkan.nextInt();
                    float reamur = 4/5 * suhu;
                    System.out.println(reamur+"R");
                }
                case 4 -> {
                    System.out.println("Out");
                }
                default -> {
                    System.out.println("Pilihan tidak valid");
                }
            }    
        } while (input_pilihan !=4);
           masukkan.close();     
    }                  
}   


