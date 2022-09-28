
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ratih Mardianingsih
 */
public class Aritmatika {
     public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
        int jam, menit , detik, konversi;
        System.out.print("Berapa detik yang ingin anda konversikan : ");
        konversi = input.nextInt();
        
        jam  = konversi/3600;
        menit= (konversi%3600)/60;
        detik= (konversi%3600)%60;
        
        System.out.println("konversi dari : "+konversi+" detik, Adalah : ");
        System.out.println(jam+" jam, "+menit+" menit, "+detik+" detik");
        
        
}
