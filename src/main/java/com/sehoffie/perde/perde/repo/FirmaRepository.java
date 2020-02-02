package com.sehoffie.perde.perde.repo;

import com.sehoffie.perde.perde.entity.FirmaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FirmaRepository  extends CrudRepository<FirmaEntity, String> {
    List<FirmaEntity> findAll();
    void deleteById(String vergiNo);
    Optional<FirmaEntity> findById(Long id);
}


