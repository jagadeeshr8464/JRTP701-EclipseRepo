package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.nt.document.Player;

public interface PlayerRepository extends MongoRepository<Player, Integer>, CrudRepository<Player, Integer> {

}
