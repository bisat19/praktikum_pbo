/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    :17 Maret 2024
Lab C1*/
/**Membuat package main**/
package org.main;
import org.walimahasiswa.*;
import org.mahasiswa.*;

public class Main{
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Lorem Ipsum", "123-444-564", "087-777-908", "St. John Ltemburg No. 4");
        Mahasiswa mhs1 = new Mahasiswa("Anita De Cruze", "778-778-909", "0989-9999", "Antropologi", wali1);
        System.out.println("=====Data 1=====");
        wali1.cetak();
        mhs1.cetak();
        System.out.println("=====Ubah Data 1=====");
        wali1.setAlamat("St. Petterburg No 123");
        mhs1.setJurusan("Biodesi");
        wali1.cetak(); mhs1.cetak();}
    }