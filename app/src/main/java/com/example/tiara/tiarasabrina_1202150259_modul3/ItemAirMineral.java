package com.example.tiara.tiarasabrina_1202150259_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItemAirMineral  {
    //membuat variable untuk menampung nilai dari String dan int
    private String namamerk, infoproduk, deskripsiproduk;
    private int gambarproduk;

    //membuat konstruktor dari kelas ItemAirMineral
    public ItemAirMineral(String nama, String info, String deskripsi, int gambar) {
        //nilai dari nama, info dan deskripsi, gambar akan dimasukan ke variable
        this.namamerk = nama;
        this.infoproduk = info;
        this.deskripsiproduk = deskripsi;
        this.gambarproduk = gambar;
    }


    public String getNama() {

        return namamerk;
    } //method get nama

    public void setNama(String nama) {

        this.namamerk = nama;
    } //method set nama

    public String getInfo()
    {
        return infoproduk;
    } //method getinfo

    public void setInfo(String info)
    {
        this.infoproduk = info;
    } //method set info

    public String getDeskripsi() {
        return deskripsiproduk;
    } //method get deskripsi

    public void setDeskripsi(String deskripsi) {
        this.deskripsiproduk = deskripsi;
    } //method set deskripsi

    public int getGambar() {
        return gambarproduk;
    } //method get gambar

    public void setGambar(int gambar) {
        this.gambarproduk = gambar;
    } //method set gambar
}


