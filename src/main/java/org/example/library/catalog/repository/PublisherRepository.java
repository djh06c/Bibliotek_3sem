package org.example.library.catalog.repository;

import org.example.library.catalog.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    List<Publisher> findByNameContaining(String name);
}
