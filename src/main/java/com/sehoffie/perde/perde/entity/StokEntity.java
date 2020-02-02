package com.sehoffie.perde.perde.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class StokEntity {

    @Id
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "urun_kodu",nullable = false)
    private Long urunKodu;
    @Column(name = "adi",nullable = false)
    private String adi;
    @Column(name = "renk", nullable = false)
    private String renk;

    @OneToMany
    @JoinColumn(name = "firma_id",referencedColumnName = "id")
    private FirmaEntity firmaId;
    @Column(name = "etar")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "DD-MM-YYYY")
    private Date etar;

    @Column(name = "ekul")
    private Long ekul;

    @Column(name = "dtar")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "DD-MM-YYYY")
    private Date dtar;

    @Column(name = "dkul")
    private Long dkul;

    public StokEntity(Long id, Long urunKodu, String adi, String renk, FirmaEntity firmaId, Date etar, Long ekul, Date dtar, Long dkul) {
        this.id = id;
        this.urunKodu = urunKodu;
        this.adi = adi;
        this.renk = renk;
        this.firmaId = firmaId;
        this.etar = etar;
        this.ekul = ekul;
        this.dtar = dtar;
        this.dkul = dkul;
    }

    public StokEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUrunKodu() {
        return urunKodu;
    }

    public void setUrunKodu(Long urunKodu) {
        this.urunKodu = urunKodu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public FirmaEntity getFirmaId() {
        return firmaId;
    }

    public void setFirmaId(FirmaEntity firmaId) {
        this.firmaId = firmaId;
    }

    public Date getEtar() {
        return etar;
    }

    public void setEtar(Date etar) {
        this.etar = etar;
    }

    public Long getEkul() {
        return ekul;
    }

    public void setEkul(Long ekul) {
        this.ekul = ekul;
    }

    public Date getDtar() {
        return dtar;
    }

    public void setDtar(Date dtar) {
        this.dtar = dtar;
    }

    public Long getDkul() {
        return dkul;
    }

    public void setDkul(Long dkul) {
        this.dkul = dkul;
    }
}
