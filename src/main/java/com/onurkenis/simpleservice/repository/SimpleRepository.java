package com.onurkenis.simpleservice.repository;

import com.onurkenis.simpleservice.entity.Simple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleRepository extends JpaRepository<Simple, Long> {
}
