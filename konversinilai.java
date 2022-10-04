/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class konversinilai {
  public static void main(String[] args) {
    String nim, nama, prodi, matkul;
    int nilai;
        Scanner masukan = new Scanner (System.in);
        System.out.println("======masukan data======");
        System.out.println("Masukan NIM = ");
        nim = masukan.nextLine();
        System.out.println("Masukan Nama = ");
        nama = masukan.nextLine();
        System.out.println("Matakuliah = ");
        matkul = masukan.nextLine();
        System.out.println("Masukan nilai angka = ");
        nilai = masukan.nextInt();
        
        System.out.println("======hasil pengolahan data=====");
//        ==mengambil jutusan dari NIM
        prodi = nim.substring(3,5);
        System.out.println("program studi");
         switch (prodi){
             case ("52"):
            System.out.println(" Program studi S-I Teknik Informasi");
            break;
        } switch (prodi) {
            case ("51"):
            System.out.println("Program studi S-I Sistem Informasi");
            break;
        } switch (prodi){
            case ("31"):
            System.out.println("Program studi  D-3 Sistem Informasi");
            break;
            default:
            System.out.println("Program studi tidak ditemukan");
            break;
        }
    }  
}
