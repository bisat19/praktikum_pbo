/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 * Abisatya Hastarangga Pradana - 24060122120004
 * 01/05/2024
 * @author Abisatya
 */
public class KontrolSenjata {
    Senjata senjata;
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    public boolean isAdaPeluru(){
        return this.senjata.getPeluru() > 0;
    }
    public void isiPeluru(int jumPeluru){
        this.senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: "+jumPeluru);
    }
    public void menembak (int jumlah){
        System.out.println("Siap menembak "+jumlah+" kali");
        int peluruAwal = this.senjata.getPeluru();
        if (!this.isAdaPeluru()){
            System.out.println("Peluru habis");
        }else{
            for (int i = 0; i < jumlah; i++){
                if(this.isAdaPeluru()){
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(this.senjata.getPeluru() - 1);
                }else{
                    System.out.println("Gagal tembak, Peluru Habis!");
                }
            }
            System.out.println("Peluru sisa: "+this.senjata.getPeluru());
        }
    }
    public String menusuk(){
        if (this.senjata.isMenusuk()){
           return "Jleb!"; 
        }else{
            return "Gagal, belum pasang bayonet";
        }
    }
    public void pasangBayonet(){
        this.senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
