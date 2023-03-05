package com.springboot_mongodb_ingestion_service.repository;

import com.springboot_mongodb_ingestion_service.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PlayerRepository  extends MongoRepository<Player,String>
{

}
