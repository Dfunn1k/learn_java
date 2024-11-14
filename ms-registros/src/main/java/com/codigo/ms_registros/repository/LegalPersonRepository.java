package com.codigo.ms_registros.repository;

import com.codigo.ms_registros.entity.LegalPersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalPersonRepository extends JpaRepository<LegalPersonEntity, Long> {
}
