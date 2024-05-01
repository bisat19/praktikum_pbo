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
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    public String getBunyi(){
        return this.bunyi;
    }
    public int getPeluru(){
        return this.peluru;
    }
    public boolean isMenusuk(){
        return this.menusuk;
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk= menusuk;
    }
    public void setPeluru(int peluru){
        this.peluru=peluru;
    }
}
