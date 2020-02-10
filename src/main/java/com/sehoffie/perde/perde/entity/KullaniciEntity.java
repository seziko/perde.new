package com.sehoffie.perde.perde.entity;

public class KullaniciEntity {

    Long id;
    String kimlik_id;
    String kullanici_adi;
    String sifre;


    public KullaniciEntity(Long id, String kimlik_id, String kullanici_adi, String sifre) {
        this.id = id;
        this.kimlik_id = kimlik_id;
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
    }
}
