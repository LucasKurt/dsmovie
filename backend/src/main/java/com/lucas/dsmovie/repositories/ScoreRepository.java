package com.lucas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.dsmovie.entities.Score;
import com.lucas.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
