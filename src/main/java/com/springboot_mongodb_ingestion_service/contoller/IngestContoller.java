package com.springboot_mongodb_ingestion_service.contoller;

import com.springboot_mongodb_ingestion_service.model.Player;
import com.springboot_mongodb_ingestion_service.repository.PlayerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngestContoller {

    @Autowired
    private PlayerRepository playerRepository;

//    @GetMapping("/call/ingest/service")
//    public Player insertInToMongo()
//    {
////        Player player=new Player("virat","india","delhi",34,"Batsman", List.of("india","RCB"));
////        Player save = playerRepository.save(player);
////        return save;
//        return
//    }

    @PostMapping("/call/ingest/service")
    public ResponseEntity<Player> insertInToMongoFromUserInput(@Valid @RequestBody Player player)
    {

        Player save = playerRepository.save(player);
        return new ResponseEntity<>(save,HttpStatus.CREATED);
    }
}
