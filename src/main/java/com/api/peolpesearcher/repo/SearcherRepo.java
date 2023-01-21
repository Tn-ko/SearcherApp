package com.api.peolpesearcher.repo;

import com.api.peolpesearcher.model.Searcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository


public interface SearcherRepo extends JpaRepository<Searcher, Long> {
    void deleteSearcherById(Long id); //making query by method name
    Optional<Searcher> findByUsername(String username);

    Optional<Searcher> findSearcherById(Long id);
}
