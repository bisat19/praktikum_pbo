/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanveryeasy;

/**
 * Abisatya Hastarangga Pradana - 24060122120004
 * 01/05/2024
 * @author Abisatya
 */
public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.print("Jumlah Peluru AK47: "+ ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: "+ ak47.getPeluru());
        
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
