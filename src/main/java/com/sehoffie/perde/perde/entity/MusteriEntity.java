package com.sehoffie.perde.perde.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class MusteriEntity {

    @Id
    @Column(name = "id",nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "kimlik_id",referencedColumnName = "id",nullable = false)
    private KimlikEntity kimlikId;

    @OneToOne
    @JoinColumn(name = "gsm_telefon",referencedColumnName = "gsm_telefon",nullable = false)
    private KimlikEntity gsmTelefon;

    @OneToOne
    @JoinColumn(name = "is_telefon",referencedColumnName = "is_telefon",nullable = false)
    private KimlikEntity isTelefon;

    @OneToOne
    @JoinColumn(name = "ev_telefon",referencedColumnName = "ev_telefon",nullable = false)
    private KimlikEntity evTelefon;

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

    public MusteriEntity(Long id, KimlikEntity kimlikId,Date etar,Long ekul,Date dtar,Long dkul) {
        this.id = id;
        this.kimlikId = kimlikId;
        this.ekul= ekul;
        this.etar = etar;
        this.dkul = dkul;
        this.dtar = dtar;

    }


    public MusteriEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public KimlikEntity getKimlikId() {
        return kimlikId;
    }

    public void setKimlikId(KimlikEntity kimlikId) {
        this.kimlikId = kimlikId;
    }

    public KimlikEntity getGsmTelefon() {
        return gsmTelefon;
    }

    public void setGsmTelefon(KimlikEntity gsmTelefon) {
        this.gsmTelefon = gsmTelefon;
    }

    public KimlikEntity getIsTelefon() {
        return isTelefon;
    }

    public void setIsTelefon(KimlikEntity isTelefon) {
        this.isTelefon = isTelefon;
    }

    public KimlikEntity getEvTelefon() {
        return evTelefon;
    }

    public void setEvTelefon(KimlikEntity evTelefon) {
        this.evTelefon = evTelefon;
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
