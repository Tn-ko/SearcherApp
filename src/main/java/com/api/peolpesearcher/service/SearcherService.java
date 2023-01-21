package com.api.peolpesearcher.service;

import com.api.peolpesearcher.exception.UserNotFoundException;
import com.api.peolpesearcher.model.Searcher;
import com.api.peolpesearcher.repo.SearcherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class SearcherService {
    private final SearcherRepo searcherRepo;
@Autowired
    public SearcherService(SearcherRepo searcherRepo) {
        this.searcherRepo = searcherRepo;
    }
     public Searcher addSearcher(Searcher searcher) {
        searcher.setSearcherCode(UUID.randomUUID().toString());
        return searcherRepo.save(searcher);
     }
     public List<Searcher> findAllSearchers() {
        return searcherRepo.findAll();
     }
    public Searcher updateSearcher(Searcher searcher) {
        return searcherRepo.save(searcher);
    }
    public Searcher findSearcherById(Long id) {
        return  searcherRepo.findSearcherById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id" + id + "wasn't found"));
    }


    public void deleteSearcher(Long id) {
        searcherRepo.deleteSearcherById(id);
    }
}

