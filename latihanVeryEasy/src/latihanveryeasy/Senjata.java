/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanveryeasy;

/**
 * Abisatya Hastarangga Pradana - 24060122120004
 * 01/05/2024
 * @author Abisatya
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    public String getBunyi(){
        return this.bunyi;
    }
    public int getPeluru(){
        return this.peluru;
    }
    
    public void menembak (){
        if(this.getPeluru()>0){
            System.out.println(this.getBunyi());
            int sisaPeluru = this.getPeluru()-1;
            System.out.println("Sisa peluru: "+sisaPeluru);
        }else{
            System.out.println("Peluru habis!");
        }
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
