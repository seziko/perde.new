package com.sehoffie.perde.perde.services;

import com.sehoffie.perde.perde.entity.KimlikEntity;
import com.sehoffie.perde.perde.entity.MusteriEntity;
import com.sehoffie.perde.perde.repo.KimlikRepository;
import com.sehoffie.perde.perde.repo.MusteriRepository;
import com.sehoffie.perde.perde.repo.StokRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MusteriServices {

    private final MusteriRepository musteriRepository;
    private final KimlikRepository kimlikRepository;
    private final StokRepository stokRepository;

    @Autowired
    public MusteriServices(MusteriRepository musteriRepository, KimlikRepository kimlikRepository, StokRepository stokRepository) {
        this.musteriRepository = musteriRepository;
        this.kimlikRepository = kimlikRepository;
        this.stokRepository = stokRepository;
    }


    public List<MusteriEntity> musteriEntityList(){
        return musteriRepository.findAll();

    }

    public void delete(String id){
         musteriRepository.deleteById(id);
    }

    public void  save(MusteriEntity musteriEntity){
        Optional<KimlikEntity> kimlikEntity = kimlikRepository.findById(1L);
    }


}
