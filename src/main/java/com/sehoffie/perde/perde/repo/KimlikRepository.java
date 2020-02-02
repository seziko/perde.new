package com.sehoffie.perde.perde.repo;

import com.sehoffie.perde.perde.entity.KimlikEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface KimlikRepository extends CrudRepository<KimlikEntity, String> {
    List<KimlikEntity> findAll();
    void deleteById(Long id);
    Optional<KimlikEntity> findById(Long id);
}
