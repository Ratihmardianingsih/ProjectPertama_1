
import java.io.Console;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ratih Mardianingsih
 */
public class ontohonsol {
      public static void main(String[] args) {
    String nama;
    int usia;
    Console masukan = System.console();
    System.out.println("Masukan nama =");
    nama = masukan.readLine();
    System.out.println("Masukan usia =");
    usia = Integer.parseInt(masukan.readLine());
    System.out.println("Namamu adalah = "+nama);
    System.out.println("Usiamu adalah = "+usia);
}
}
