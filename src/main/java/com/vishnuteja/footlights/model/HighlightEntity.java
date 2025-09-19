package com.vishnuteja.footlights.model;

import jakarta.persistence.*;

import java.net.URL;
import java.time.OffsetDateTime;

enum HighlightType{
    GOAL,
    YELLOW,
    RED,
    CHANCE,
    FOUL,
    PlAY
}

@Entity
public class HighlightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private URL redditUrl;
    private String title;
    private String matchTime;
    private OffsetDateTime scrapedAt;

    @ManyToOne
    @JoinColumn
    private MatchEntity matchId;
}
