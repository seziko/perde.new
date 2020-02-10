package com.sehoffie.perde.perde.controller;


import com.sehoffie.perde.perde.entity.FirmaEntity;
import com.sehoffie.perde.perde.entity.KullaniciEntity;
import com.sehoffie.perde.perde.entity.StokEntity;
import com.sehoffie.perde.perde.repo.StokRepository;
import com.sehoffie.perde.perde.services.StokServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "/urunEkle")
public class StokResource {

    public final StokServices stokServices;
    public final StokEntity stokEntity;

    @Autowired
    public StokResource(StokServices stokServices, StokEntity stokEntity) {
        this.stokServices = stokServices;
        this.stokEntity = stokEntity;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/all")
    public List<StokRepository> getAllStok(){
        return stokServices.getAllStok();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Optional getStok(@PathVariable Long id){
        return stokServices.findById(id);
    }



    public StokEntity save(StokEntity stok){
        Optional<FirmaEntity> firma = stokServices.findById(1L);
        firma.ifPresent(stokEntity::setFirmaId);
        return (StokEntity) stokServices.save(stok);
    }

}
