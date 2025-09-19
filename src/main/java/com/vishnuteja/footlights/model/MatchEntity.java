package com.vishnuteja.footlights.model;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.Stack;

enum MatchStatus {
    PREMATCH("pre"),
    LIVE("in"),
    POSTMATCH("post");

    private final String statusName;

    MatchStatus(String statusName){
        this.statusName = statusName;
    }
    public String getShortName(){
        return statusName;
    }

    @Override
    public String toString(){
        return statusName;
    }
}


@Entity
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String externalMatchId;
    private String firstTeam;
    private String secondTeam;
    private int scoreFirstTeam;
    private int scoreSecondTeam;

    @Enumerated
    private MatchStatus status;

    private byte matchHalf;
    private String matchBreak;
    private OffsetDateTime startTime;
    private OffsetDateTime lastUpdated;
    private Stack<HighlightEntity> highlights;

    @Transient
    private String scoreString;
}
