package com.sehoffie.perde.perde.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table
public class KimlikEntity {

    @Id
    @Column (name = "id",nullable = false)
    private Long id;

    @Column(name = "tc_kimlik_no",nullable = false)
    @Size(max = 11,min = 11)
    private Long tcKimlikNo;

    @Column(name = "adi_soyadi",nullable = false)
    private String adiSoyadi;


    @Column(name = "dogum_tarihi",nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "DD-MM-YYYY")
    private Date dogumTarihi;

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

    @Column(name = "gsm_telefon")
    @Size(max = 11, min = 11)
    private Long gsmTelefon;

    @Column(name = "is_telefon")
    @Size(max = 11, min = 11)
    private Long isTelefon;

    @Column(name = "ev_telefon")
    @Size(max = 11, min = 11)
    private Long evTelefon;


    public KimlikEntity(Long id, @Size(max = 11, min = 11) Long tcKimlikNo,
                        String adiSoyadi, Date dogumTarihi, Date etar,
                        Long ekul, Date dtar, Long dkul, Long gsmTelefon, Long isTelefon, Long evTelefon) {
        this.id = id;
        this.tcKimlikNo = tcKimlikNo;
        this.adiSoyadi = adiSoyadi;
        this.dogumTarihi = dogumTarihi;
        this.etar = etar;
        this.ekul = ekul;
        this.dtar = dtar;
        this.dkul = dkul;
        this.gsmTelefon = gsmTelefon;
        this.isTelefon = isTelefon;
        this.evTelefon = evTelefon;

    }

    public KimlikEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(Long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
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

    public Long getGsmTelefon() {
        return gsmTelefon;
    }

    public void setGsmTelefon(Long gsmTelefon) {
        this.gsmTelefon = gsmTelefon;
    }

    public Long getIsTelefon() {
        return isTelefon;
    }

    public void setIsTelefon(Long isTelefon) {
        this.isTelefon = isTelefon;
    }

    public Long getEvTelefon() {
        return evTelefon;
    }

    public void setEvTelefon(Long evTelefon) {
        this.evTelefon = evTelefon;
    }
}
