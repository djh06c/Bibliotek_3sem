package org.example.library.catalog.repository;

import org.example.library.catalog.model.Edition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EditionRepository extends JpaRepository<Edition, Long> {
    List<Edition> findByEditionNumber(String editionNumber);
}
