package com.sehoffie.perde.perde.services;

import com.sehoffie.perde.perde.entity.FirmaEntity;
import com.sehoffie.perde.perde.entity.StokEntity;
import com.sehoffie.perde.perde.repo.FirmaRepository;
import com.sehoffie.perde.perde.repo.StokRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StokServices {

    private final StokRepository stokRepository;
    private final FirmaRepository firmaRepository;

    @Autowired
    public StokServices(StokRepository stokRepository, FirmaRepository firmaRepository) {
        this.stokRepository = stokRepository;
        this.firmaRepository = firmaRepository;
    }

    public List<StokRepository> getAllStok(){
        return stokRepository.findAll();
    }

    public void delete (String urunKodu){
         stokRepository.deleteByUrunKodu(urunKodu);
    }



    public Object save(StokEntity stokEntity){
        Optional<FirmaEntity> firmaEntity = firmaRepository.findById(1L);
        firmaEntity.ifPresent(stokEntity::setFirmaId);
        return stokRepository.save(stokEntity);
    }

    public void findById(String id) {
        stokRepository.findById(id);
    }

}
