package com.lucas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
