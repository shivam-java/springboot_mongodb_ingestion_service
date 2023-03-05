package com.springboot_mongodb_ingestion_service.model;
import com.springboot_mongodb_ingestion_service.model.stats.Stats;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import lombok.*;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;




@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "#{@environment.getProperty('spring.data.mongodb.collection')}"
)
@Data

public class Player {
  Profile profile;
  Stats stats;
  CarrerSummary carrerSummary;
}
