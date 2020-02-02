package com.sehoffie.perde.perde.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table
public class FirmaEntity {

    @Id
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "firma_no",nullable = false)
    private Long firmaNo;
    @Column (name = "adi",nullable = false)
    private String firmaAdi;
    @Column(name = "Vergi_Dairesi",nullable = false)
    private String vergiDairesi;
    @Column(name = "vergi_numarasi")
    private Long vergiNumarasi;
    @Column(name = "gsm_telefon",nullable = false)
    @Size(max = 11, min = 11)
    private Long gsmTelefon;
    @Column(name = "is_telefon")
    @Size(max = 11, min = 11)
    private Long isTelefon;
    @Column(name = "ev_teleofn")
    @Size(max = 11, min = 11)
    private Long evTelefon;
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


    public FirmaEntity(Long id, Long firmaNo, String firmaAdi, String vergiDairesi,
                       Long vergiNumarasi, @Size(max = 11, min = 11) Long gsmTelefon,
                       @Size(max = 11, min = 11) Long isTelefon, @Size(max = 11, min = 11) Long evTelefon,Date etar, Long ekul, Date dtar, Long dkul) {
        this.id = id;
        this.firmaNo = firmaNo;
        this.firmaAdi = firmaAdi;
        this.vergiDairesi = vergiDairesi;
        this.vergiNumarasi = vergiNumarasi;
        this.gsmTelefon = gsmTelefon;
        this.isTelefon = isTelefon;
        this.evTelefon = evTelefon;
        this.etar = etar;
        this.ekul = ekul;
        this.dtar = dtar;
        this.dkul = dkul;
    }

    public FirmaEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFirmaNo() {
        return firmaNo;
    }

    public void setFirmaNo(Long firmaNo) {
        this.firmaNo = firmaNo;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getVergiDairesi() {
        return vergiDairesi;
    }

    public void setVergiDairesi(String vergiDairesi) {
        this.vergiDairesi = vergiDairesi;
    }

    public Long getVergiNumarasi() {
        return vergiNumarasi;
    }

    public void setVergiNumarasi(Long vergiNumarasi) {
        this.vergiNumarasi = vergiNumarasi;
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
