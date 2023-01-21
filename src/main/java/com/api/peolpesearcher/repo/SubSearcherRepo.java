package com.api.peolpesearcher.repo;

import com.api.peolpesearcher.model.SubSearcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface SubSearcherRepo extends JpaRepository<SubSearcher, Long> {

    Optional<SubSearcher> findByName(String subSearcherName);
}
