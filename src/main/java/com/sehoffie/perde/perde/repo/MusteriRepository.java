package com.sehoffie.perde.perde.repo;

import com.sehoffie.perde.perde.entity.MusteriEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MusteriRepository extends CrudRepository<MusteriEntity, String> {
        List<MusteriEntity> findAll();
        void deleteById(String id);
        Optional<MusteriEntity> findById(String tcKimlikNo);

}