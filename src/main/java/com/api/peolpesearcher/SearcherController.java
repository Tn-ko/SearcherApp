package com.api.peolpesearcher;

import com.api.peolpesearcher.model.Searcher;
import com.api.peolpesearcher.service.SearcherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/searcher")
public class SearcherController {
    private final SearcherService searcherService;

    public SearcherController(SearcherService searcherService) {
        this.searcherService = searcherService; // controller inject service
    }
    @GetMapping("/all")
    public ResponseEntity<List<Searcher>> getAllSearchers(){
        List<Searcher> searchers = searcherService.findAllSearchers();
        return new ResponseEntity<>(searchers, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Searcher> getSearcher(@PathVariable("id") Long id){
        Searcher searcher = searcherService.findSearcherById(id);
        return new ResponseEntity<>(searcher, HttpStatus.OK);
    }
     @PostMapping("/add")
     public ResponseEntity<Searcher> addSearcher(@RequestBody Searcher searcher){
        Searcher newSearcher = searcherService.addSearcher(searcher);
        return new ResponseEntity<>(newSearcher, HttpStatus.CREATED);
     }
    @PutMapping("/update")
    public ResponseEntity<Searcher> updateSearcher(@RequestBody Searcher searcher){
        Searcher updateSearcher = searcherService.updateSearcher(searcher);
        return new ResponseEntity<>(updateSearcher, HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSearcher(@PathVariable("id") Long id){
        searcherService.deleteSearcher(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
