
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ratih Mardianingsih
 */
public class ontohbuffer {
      public static void main(String[] args) throws IOException {
         InputStreamReader isr = new InputStreamReader(System.in);
         String nama;
         int usia;
         BufferedReader br = new BufferedReader(isr);
         
         System.out.print("Masukkan Nama = ");
         nama = br.readLine();
         System.out.print("Masukkan usia = ");
         usia = Integer.parseInt(br.readLine());
         System.out.println("Namamu adalah = "+nama);
         System.out.println("Usiamu adalah = "+usia);
     }
}
