package com.api.peolpesearcher.repo;


import com.api.peolpesearcher.model.Post;
import com.api.peolpesearcher.model.Searcher;
import com.api.peolpesearcher.model.SubSearcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(SubSearcher subreddit);

    List<Post> findByUser(Searcher searcher);
}
