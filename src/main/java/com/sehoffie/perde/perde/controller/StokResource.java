package com.sehoffie.perde.perde.controller;


import com.sehoffie.perde.perde.repo.StokRepository;
import com.sehoffie.perde.perde.services.StokServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "/urunEkle")
public class StokResource {

    public final StokServices stokServices;

    @Autowired
    public StokResource(StokServices stokServices) {
        this.stokServices = stokServices;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/all")
    public List<StokRepository> getAllStok(){
        return stokServices.getAllStok();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{code}")
    public void getStok(@PathVariable String code){
        return  stokServices.findById(id);
    }


}
