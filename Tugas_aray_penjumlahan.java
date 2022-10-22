/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_aray_penjumlahan;

import java.util.Scanner;

/**
 *
 * @author Ratih Mardianingsih
 */
public class Tugas_aray_penjumlahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner masukan = new Scanner(System.in);        
        
        int matrix1[] [] = new int[4][4]; //jumlah kurung siku untuk melihat dimensi dari array
        
        int matrix2[] [] = new int[4][4];
        
        System.out.println("Matrix 1");
        
        for (int m = 0; m < matrix1.length; m++){
            for (int n = 0; n < matrix1[0].length; n++)
            {
                System.out.println("Masukkan isi Baris ke  [" + m +"][" +n +"] : ");
                matrix1[m][n] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("");
        System.out.println("Matrix 2");
        
        for (int m = 0; m < matrix2.length; m++){
            for (int n = 0; n < matrix2[0].length; n++)
            {
                System.out.println("Masukkan isi Kolom ke [" + m +"][" +n +"] : ");
                matrix2[m][n] = masukan.nextInt();
            }
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("Matrix 1 ");
        
        for (int m = 0; m < matrix1.length; m++){
            for (int n = 0; n < matrix1[0].length; n++)
            {
                System.out.print(matrix1[m][n] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix 2 ");
        
        for (int m = 0; m < matrix2.length; m++){
            for (int n = 0; n < matrix2[0].length; n++)
            {
                System.out.print(matrix2[m][n] + " ");
            }
            System.out.println("");
        }
      
        
        System.out.println("");
        System.out.println("Penjumlahan");
        
        for (int m = 0; m < matrix1.length; m++){
            for (int n = 0; n < matrix1[0].length; n++){
                int hasil = matrix1[m][n] + matrix2[m][n];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
    }
    
}
