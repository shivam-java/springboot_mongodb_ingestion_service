package com.springboot_mongodb_ingestion_service.model.stats.batting_stats;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class T20IMatches {
    int matches;
    int innings;
    int runs;
    int hundreds;
    int fifties;
    int avg;
    int strikeRate;



}
