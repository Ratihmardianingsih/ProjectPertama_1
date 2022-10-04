/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int angka = 3;
//        if (angka%2==0) {
//            System.out.println("Bilangan Genap");
//        } else {
//            System.out.println("Bilangan Ganjil");
//        }
        
       
        Scanner masukan = new Scanner (System.in);
        System.out.print("Masukan angka = ");
        int angka = masukan.nextInt ();
        if (angka%2==0) {
            if (angka>10) {
        System.out.println("bilangan genap dan");    
        System.out.println("merupakan bilangan puluhan");
        } else {
        System.out.println("Angka" + angka + "adalah");
        System.out.println("bilangan ganjil");
        }
        
        String hasil = angka%2== 0 ? " bilangan genap ":" bilangan ganjil ";
        System.out.println("Angka " + angka + " adalah" + hasil);
        System.out.println("hasil");

    }
    
}
