package com.codigo.ms_registros.repository;

import com.codigo.ms_registros.entity.NaturalPersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NaturalPersonRepository extends JpaRepository<NaturalPersonEntity, Long> {
}
