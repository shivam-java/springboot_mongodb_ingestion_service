package com.springboot_mongodb_ingestion_service.model.stats;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Stats {
    BattingStats battingStats;
    BowlingStats bowlingStats;

}
