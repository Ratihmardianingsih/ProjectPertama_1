/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walikan;

import java.util.Scanner;

/**
 *
 * @author Noval
 */
public class Walikan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
        System.out.println("Masukkan kata atau kalimat : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String strRev =" ";
        
        System.out.println("Kata yang dimasukkan adalah : "+str);
        for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        strRev = c+strRev;
    }
        System.out.print("Jika dibalik menjadi : "+strRev);
        System.out.println(" ");

    }
}
