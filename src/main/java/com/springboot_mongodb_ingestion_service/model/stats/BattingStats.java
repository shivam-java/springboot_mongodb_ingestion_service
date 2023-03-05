package com.springboot_mongodb_ingestion_service.model.stats;


import com.springboot_mongodb_ingestion_service.model.stats.batting_stats.ODIMatches;
import com.springboot_mongodb_ingestion_service.model.stats.batting_stats.T20IMatches;
import com.springboot_mongodb_ingestion_service.model.stats.batting_stats.TestMatches;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BattingStats {

TestMatches testMatches;
ODIMatches odiMatches;
T20IMatches t20IMatches;

}
