/* MPoligon.java
 * Nama: Abisatya Hastarangga Pradana
 * NIM: 24060122120004
 * Tgl: 16 Mar 2024
 * Deskripsi : Membuat main poligon
 */
package org.main;
import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10 , 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
    }
    
}
