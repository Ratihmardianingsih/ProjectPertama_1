/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ratih Mardianingsih
 */
public class bit {
     public static void main(String[] args) {
    int a=3, b=5, c;
      c = a&b;
        System.out.println("a AND b = " + c);
        c = a|b;
        System.out.println("a OR b = " + c);
        c = a^b;
        System.out.println("a EX OR b = " + c);
        c = ~a;
        System.out.println("Not a = " + c);
        c = a << 2;
        System.out.println("a geser kiri = " + c);
        c = a >> 2;
        System.out.println("a geser kanan = " + c);
    
    }   
}
