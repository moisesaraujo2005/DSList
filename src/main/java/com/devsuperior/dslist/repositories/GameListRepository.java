package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
