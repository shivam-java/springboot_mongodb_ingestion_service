package com.springboot_mongodb_ingestion_service.model.stats.bowling_stats;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class T20IMatches {
    int matches;
    int innings;
    int wickets;
    double economy;
    int fiveWicketsHauls;
    double avg;



}
