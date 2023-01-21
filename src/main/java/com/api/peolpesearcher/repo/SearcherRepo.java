package com.api.peolpesearcher.repo;

import com.api.peolpesearcher.model.Searcher;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;



public interface SearcherRepo extends JpaRepository<Searcher, Long> {
    void deleteSearcherById(Long id); //making query by method name
   

    Optional<Searcher> findSearcherById(Long id);
}
