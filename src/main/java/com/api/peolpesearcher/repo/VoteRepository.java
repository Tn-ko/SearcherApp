package com.api.peolpesearcher.repo;

import com.api.peolpesearcher.model.Post;
import com.api.peolpesearcher.model.Searcher;
import com.api.peolpesearcher.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndSearcherOrderByVoteIdDesc(Post post, Searcher currentSearcher);
}
