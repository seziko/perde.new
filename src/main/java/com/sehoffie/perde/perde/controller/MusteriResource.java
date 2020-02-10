package com.sehoffie.perde.perde.controller;
import com.sehoffie.perde.perde.repo.MusteriRepository;
import com.sehoffie.perde.perde.services.MusteriServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "/urunEkle")

public class MusteriResource {

    public final MusteriServices musteriServices;


    @Autowired
    public MusteriResource(MusteriServices musteriServices) {
        this.musteriServices = musteriServices;
    }






}
