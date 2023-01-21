package com.api.peolpesearcher.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    public class Post implements Serializable {
        @jakarta.persistence.Column
        @Id
        @GeneratedValue(strategy = IDENTITY)
        private Long postId;
        @NotBlank(message = "Post Name cannot be empty or Null")
        private String postName;
        @Nullable
        private String url;
        @Nullable
        @Lob
        private String description;
        private Integer voteCount = 0;
        @ManyToOne(fetch = LAZY)
        @JoinColumn(name = "id", referencedColumnName = "id")
        private Searcher searcher;
        private Instant createdDate;
        @ManyToOne(fetch = LAZY)
        @JoinColumn(name = "id", referencedColumnName = "id")
        private SubSearcher subsearcher;
    }

