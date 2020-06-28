package com.xxiris.payer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xxiris.payer.model.Payer;

@Repository
public interface payerRepository extends JpaRepository<Payer, Integer> {

}
