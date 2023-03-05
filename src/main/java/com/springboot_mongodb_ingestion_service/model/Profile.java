package com.springboot_mongodb_ingestion_service.model;


import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Profile {

    @NotNull(message = "please enter name")
    @Indexed(unique = true)
    private   String name;
    @NotNull(message = "please enter country name")
    String country;
    String birthPlace;
    int age;
    @NotNull(message = "please enter role")
    String role;
    @NotNull(message = "please enter at least one team name")
    List<String> teams;
}
