package com.sehoffie.perde.perde.repo;

import com.sehoffie.perde.perde.entity.StokEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StokRepository extends CrudRepository {
         List<StokRepository> findAll();
        void deleteByUrunKodu(String urunKodu);
        void addByUrunKodu(String urunKodu);
        Optional<StokRepository> findById(Long id);
    }